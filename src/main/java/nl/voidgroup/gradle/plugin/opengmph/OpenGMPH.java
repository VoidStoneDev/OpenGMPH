package nl.voidgroup.gradle.plugin.opengmph;

import nl.voidgroup.gradle.plugin.opengmph.annotation.Dependency;
import nl.voidgroup.gradle.plugin.opengmph.annotation.Repository;
import nl.voidgroup.gradle.plugin.opengmph.annotation.YML;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftServer;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftVersion;
import nl.voidgroup.gradle.plugin.opengmph.extension.PluginData;
import nl.voidgroup.gradle.plugin.opengmph.task.GenYML;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.jvm.tasks.Jar;

import java.net.URI;
@SuppressWarnings("unused")
public class OpenGMPH implements Plugin<Project> {


    PluginData pluginData;
    Jar jarTask;
    GenYML genYMLTask;
    @Override
    public void apply(Project project) {
        pluginData = project.getExtensions().create("pluginData", PluginData.class);
        jarTask = (Jar) project.getTasks().getByName("jar");
        genYMLTask = project.getTasks().create("genYML", GenYML.class);
        genYMLTask.setGroup("build");
        genYMLTask.shouldRunAfter("processResources");
        project.afterEvaluate(project1 -> {
            if(pluginData.importRepo) {
                MinecraftServer targetServer = Util.requireNonNull(pluginData.targetServer, "Target server not set");
                if(!targetServer.getClass().isAnnotationPresent(Repository.class)) {
                    project.getLogger().warn("Current target server does not support auto repository importing");
                    return;
                }
                Repository repo = targetServer.getClass().getAnnotation(Repository.class);
                project.getRepositories().maven(mavenArtifactRepository -> {
                    mavenArtifactRepository.setName(repo.name());
                    mavenArtifactRepository.setUrl(URI.create(repo.url()));
                });
            }
            if(pluginData.importDep) {
                MinecraftServer targetServer = Util.requireNonNull(pluginData.targetServer, "Target server not set");
                MinecraftVersion targetVersion = Util.requireNonNull(pluginData.targetVersion, "Target version not set");
                if(!targetServer.getClass().isAnnotationPresent(Dependency.class)) {
                    project.getLogger().warn("Current target server does not support auto dependency importing");
                    return;
                }
                Dependency dep = targetServer.getClass().getAnnotation(Dependency.class);
                String depVersion = targetServer.getVersions().get(targetVersion);
                if(depVersion == null) {
                    project.getLogger().warn("Current target server does not support auto dependency importing for current target version");
                    return;
                }
                Configuration compileOnlyConfig = project.getConfigurations().getByName("compileOnly");
                compileOnlyConfig.getDependencies().add(project.getDependencies().create(dep.group() + ":" + dep.id() + ":" + depVersion));
            }
            if(pluginData.genYML) {
                MinecraftServer targetServer = Util.requireNonNull(pluginData.targetServer, "Target server not set");
                if(!targetServer.getClass().isAnnotationPresent(YML.class)) {
                    project.getLogger().warn("Current target server does not support yml generating");
                    return;
                }
                jarTask.dependsOn("genYML");
            }
        });
    }
}

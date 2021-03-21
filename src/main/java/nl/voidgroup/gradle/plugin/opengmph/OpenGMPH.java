package nl.voidgroup.gradle.plugin.opengmph;

import nl.voidgroup.gradle.plugin.opengmph.data.MinecraftServerVersion;
import nl.voidgroup.gradle.plugin.opengmph.server.MinecraftServer;
import nl.voidgroup.gradle.plugin.opengmph.task.GenPluginYML;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.tasks.AbstractCopyTask;
import org.gradle.jvm.tasks.Jar;

import java.net.URI;

@SuppressWarnings("unused")
public class OpenGMPH implements Plugin<Project> {

    public static final String pluginName = "nl.voidgroup.opengmph";
    public static final String pluginVersion = "0.0.1-dev-001";

    private PluginHelperData pluginHelperData;

    @Override
    public void apply(Project project) {
        pluginHelperData = project.getExtensions().create("pluginHelper", PluginHelperData.class);
        Jar jarTask = (Jar) project.getTasks().getByName("jar");
        AbstractCopyTask processResourcesTask = (AbstractCopyTask) project.getTasks().getByName("processResources");
        GenPluginYML genPluginYMLTask = project.getTasks().create("genPluginYML", GenPluginYML.class);
        genPluginYMLTask.shouldRunAfter("processResources");
        project.afterEvaluate(project1 -> {
            if(pluginHelperData.importAPI) {
                MinecraftServer targetServer = Util.requireNonNull(pluginHelperData.targetServer, "pluginHelper#targetServer not set");
                MinecraftServerVersion targetVersion = Util.requireNonNull(pluginHelperData.targetVersion, "pluginHelper#targetVersion not set");
                String repositoryID = Util.requireNonNull(targetServer.getRepositoryID());
                URI repositoryURI = Util.requireNonNull(targetServer.getRepository());
                String groupID = Util.requireNonNull(targetServer.getGroupID());
                String artifactID = Util.requireNonNull(targetServer.getArtifactID());
                Configuration compileOnlyConfig = project1.getConfigurations().getByName("compileOnly");
                project1.getRepositories().maven(mavenArtifactRepository -> {
                    mavenArtifactRepository.setName(repositoryID);
                    mavenArtifactRepository.setUrl(repositoryURI);
                });
                compileOnlyConfig.getDependencies().add(project1.getDependencies().create(groupID + ":" + artifactID + ":" + targetVersion.getString()));
            }
            if(pluginHelperData.genPluginYML) {
                Util.requireNonNull(pluginHelperData.targetServer, "pluginHelper#targetServer not set");
                jarTask.dependsOn("genPluginYML");
            }
        });
    }
}

package nl.voidgroup.gradle.bukkit.plugin.helper;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.util.logging.Logger;

public class BukkitPluginHelper implements Plugin<Project> {
    private PluginHelperDataContainer pluginHelperDataContainer;
    private Logger logger;

    /**
     * Apply the Gradle {@link Plugin}
     * @param project The {@link Project} to apply the plugin to
     * @see Plugin
     */
    @Override
    public void apply(Project project) {
        logger = Logger.getLogger("GradleBukkitPluginHelper");
        pluginHelperDataContainer = project.getExtensions().create("pluginHelper", PluginHelperDataContainer.class);
        project.afterEvaluate(project1 -> {
            if(pluginHelperDataContainer.addDependencies
                    && pluginHelperDataContainer.targetAPIVersion != null
                    && pluginHelperDataContainer.targetServer != null) {
                MinecraftServerAPI api = pluginHelperDataContainer.targetServer.getAPI();
                project1.getRepositories().maven(mavenArtifactRepository -> {
                    mavenArtifactRepository.setName(api.getRepositoryName());
                    mavenArtifactRepository.setUrl(api.getRepository());
                });
                project1.getConfigurations().getByName("compileOnly").getDependencies().add(project1.getDependencies().create(api.getGroup() + ":" + api.getID() + ":" + pluginHelperDataContainer.targetAPIVersion.getString()));
            } else if (pluginHelperDataContainer.addDependencies) {
                logger.warning("Target API Version or Target Server not set");
            }
        });

    }
}

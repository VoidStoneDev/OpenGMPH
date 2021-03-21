package nl.voidgroup.gradle.plugin.opengmph.server;

import nl.voidgroup.gradle.plugin.opengmph.PluginHelperData;
import nl.voidgroup.gradle.plugin.opengmph.data.YMLObject;
import org.gradle.api.Project;

import javax.annotation.Nonnull;
import java.net.URI;

public interface MinecraftServer {
    @Nonnull
    String getRepositoryID();
    @Nonnull
    URI getRepository();
    @Nonnull
    String getGroupID();
    @Nonnull
    String getArtifactID();
    default Object getPluginDataContainer() {
        return null;
    }
    default YMLObject generatePluginYML(Project project, PluginHelperData helperData) {
        return null;
    }
}

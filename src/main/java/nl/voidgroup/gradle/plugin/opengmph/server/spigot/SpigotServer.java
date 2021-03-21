package nl.voidgroup.gradle.plugin.opengmph.server.spigot;

import nl.voidgroup.gradle.plugin.opengmph.PluginHelperData;
import nl.voidgroup.gradle.plugin.opengmph.annotation.SupportsYMLGen;
import nl.voidgroup.gradle.plugin.opengmph.data.YMLObject;
import nl.voidgroup.gradle.plugin.opengmph.server.MinecraftServer;
import org.gradle.api.Project;

import javax.annotation.Nonnull;
import java.net.URI;

@SupportsYMLGen
public class SpigotServer implements MinecraftServer {

    private final SpigotPluginData data;

    public SpigotServer() {
        data = new SpigotPluginData();
    }

    @Nonnull
    @Override
    public String getRepositoryID() {
        return "spigot-repo";
    }

    @Nonnull
    @Override
    public URI getRepository() {
        return URI.create("https://hub.spigotmc.org/nexus/content/repositories/snapshots/");
    }

    @Nonnull
    @Override
    public String getGroupID() {
        return "org.spigotmc";
    }

    @Nonnull
    @Override
    public String getArtifactID() {
        return "spigot-api";
    }

    @Override
    public Object getPluginDataContainer() {
        return data;
    }

    @Override
    public YMLObject generatePluginYML(Project project, PluginHelperData helperData) {
        return new YMLObject().add("name", data.name.getString());
    }
}

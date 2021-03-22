package nl.voidgroup.gradle.plugin.opengmph.server.spigot;

import nl.voidgroup.gradle.plugin.opengmph.annotation.Dependency;
import nl.voidgroup.gradle.plugin.opengmph.annotation.Repository;
import nl.voidgroup.gradle.plugin.opengmph.annotation.YML;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftServer;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftVersion;
import nl.voidgroup.gradle.plugin.opengmph.server.craftbukkit.Handler;

import java.util.HashMap;
import java.util.Map;
@YML(handler = Handler.class)
@Dependency(group = "org.spigotmc", id = "spigot-api")
@Repository(name = "spigot-repo", url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
public class SpigotServer implements MinecraftServer {

    @Override
    public Map<MinecraftVersion, String> getVersions() {
        return new HashMap<MinecraftVersion, String>() {{
            put(MinecraftVersion.V1_16, "1.16.5-R0.1-SNAPSHOT");
        }};
    }
}

package nl.voidgroup.gradle.plugin.opengmph.data.minecraft;

import nl.voidgroup.gradle.plugin.opengmph.server.papermc.PaperMCServer;
import nl.voidgroup.gradle.plugin.opengmph.server.spigot.SpigotServer;

import java.util.Map;

public interface MinecraftServer {
    static MinecraftServer getByName(String name) {
        switch (name.toLowerCase()) {
            case "spigotmc":
            case "spigot":
                return new SpigotServer();
            case "papermc":
            case "paper":
                return new PaperMCServer();
            default:
                return null;
        }
    }
    Map<MinecraftVersion, String> getVersions();
}

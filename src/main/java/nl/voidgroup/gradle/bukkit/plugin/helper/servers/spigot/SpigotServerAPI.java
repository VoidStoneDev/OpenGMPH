package nl.voidgroup.gradle.bukkit.plugin.helper.servers.spigot;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;

import java.net.URI;

public class SpigotServerAPI implements MinecraftServerAPI {
    @Override
    public String getRepositoryName() {
        return "spigot-repo";
    }

    @Override
    public URI getRepository() {
        return URI.create("https://hub.spigotmc.org/nexus/content/repositories/snapshots/");
    }

    @Override
    public String getGroup() {
        return "org.spigotmc";
    }

    @Override
    public String getID() {
        return "spigot-api";
    }
}

package nl.voidgroup.gradle.bukkit.plugin.helper.servers.papermc;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;

import java.net.URI;

public class PaperMCServerAPI implements MinecraftServerAPI {
    @Override
    public String getRepositoryName() {
        return "papermc-repo";
    }

    @Override
    public URI getRepository() {
        return URI.create("https://papermc.io/repo/repository/maven-public/");
    }

    @Override
    public String getGroup() {
        return "com.destroystokyo.paper";
    }

    @Override
    public String getID() {
        return "paper-api";
    }
}

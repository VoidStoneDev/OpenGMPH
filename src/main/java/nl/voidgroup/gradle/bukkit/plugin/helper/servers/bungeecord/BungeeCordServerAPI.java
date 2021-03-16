package nl.voidgroup.gradle.bukkit.plugin.helper.servers.bungeecord;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;

import java.net.URI;

public class BungeeCordServerAPI implements MinecraftServerAPI {
    @Override
    public String getRepositoryName() {
        return "bungeecord-repo";
    }

    @Override
    public URI getRepository() {
        return URI.create("https://oss.sonatype.org/content/repositories/snapshots");
    }

    @Override
    public String getGroup() {
        return "net.md-5";
    }

    @Override
    public String getID() {
        return "bungeecord-api";
    }
}

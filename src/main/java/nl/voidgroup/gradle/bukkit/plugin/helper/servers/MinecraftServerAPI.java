package nl.voidgroup.gradle.bukkit.plugin.helper.servers;

import java.net.URI;

public interface MinecraftServerAPI {
    String getRepositoryName();
    URI getRepository();
    String getGroup();
    String getID();
}

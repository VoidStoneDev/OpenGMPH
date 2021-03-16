package nl.voidgroup.gradle.bukkit.plugin.helper.servers.bungeecord;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.DefaultMinecraftServerAPIVersion;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServer;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPIVersion;

public class BungeeCordServer implements MinecraftServer {

    public static final MinecraftServerAPIVersion V1_10 = new DefaultMinecraftServerAPIVersion("1.10-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_11 = new DefaultMinecraftServerAPIVersion("1.11-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_12 = new DefaultMinecraftServerAPIVersion("1.12-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_13 = new DefaultMinecraftServerAPIVersion("1.13-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_14 = new DefaultMinecraftServerAPIVersion("1.14-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_15 = new DefaultMinecraftServerAPIVersion("1.15-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_16_R05 = new DefaultMinecraftServerAPIVersion("1.16-R0.5-SNAPSHOT");
    private BungeeCordServerAPI api;

    public BungeeCordServer() {
        this.api = new BungeeCordServerAPI();
    }

    @Override
    public MinecraftServerAPI getAPI() {
        return api;
    }
}

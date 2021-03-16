package nl.voidgroup.gradle.bukkit.plugin.helper.servers.spigot;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.DefaultMinecraftServerAPIVersion;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServer;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPIVersion;

@SuppressWarnings("unused")
public class SpigotServer implements MinecraftServer {

    public static final MinecraftServerAPIVersion V1_8 = new DefaultMinecraftServerAPIVersion("1.8-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_3 = new DefaultMinecraftServerAPIVersion("1.8.3-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_4 = new DefaultMinecraftServerAPIVersion("1.8.4-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_5 = new DefaultMinecraftServerAPIVersion("1.8.5-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_6 = new DefaultMinecraftServerAPIVersion("1.8.6-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_7 = new DefaultMinecraftServerAPIVersion("1.8.7-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_8_8 = new DefaultMinecraftServerAPIVersion("1.8.8-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_9 = new DefaultMinecraftServerAPIVersion("1.9-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_9_2 = new DefaultMinecraftServerAPIVersion("1.9.2-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_9_4 = new DefaultMinecraftServerAPIVersion("1.9.4-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_10 = new DefaultMinecraftServerAPIVersion("1.10-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_10_2 = new DefaultMinecraftServerAPIVersion("1.10.2-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_11 = new DefaultMinecraftServerAPIVersion("1.11-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_11_1 = new DefaultMinecraftServerAPIVersion("1.11.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_11_2 = new DefaultMinecraftServerAPIVersion("1.8.2-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_12 = new DefaultMinecraftServerAPIVersion("1.12-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_12_1 = new DefaultMinecraftServerAPIVersion("1.12.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_12_2 = new DefaultMinecraftServerAPIVersion("1.12.2-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_13 = new DefaultMinecraftServerAPIVersion("1.13-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_13_1 = new DefaultMinecraftServerAPIVersion("1.13.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_13_2 = new DefaultMinecraftServerAPIVersion("1.13.2-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_14 = new DefaultMinecraftServerAPIVersion("1.14-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_14_1 = new DefaultMinecraftServerAPIVersion("1.14.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_14_2 = new DefaultMinecraftServerAPIVersion("1.14.2-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_14_3 = new DefaultMinecraftServerAPIVersion("1.14.3-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_14_4 = new DefaultMinecraftServerAPIVersion("1.14.4-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_15 = new DefaultMinecraftServerAPIVersion("1.15-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_15_1 = new DefaultMinecraftServerAPIVersion("1.15.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_15_2 = new DefaultMinecraftServerAPIVersion("1.15.2-R0.1-SNAPSHOT");

    public static final MinecraftServerAPIVersion V1_16_1 = new DefaultMinecraftServerAPIVersion("1.16.1-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_16_2 = new DefaultMinecraftServerAPIVersion("1.16.2-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_16_3 = new DefaultMinecraftServerAPIVersion("1.16.3-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_16_4 = new DefaultMinecraftServerAPIVersion("1.16.4-R0.1-SNAPSHOT");
    public static final MinecraftServerAPIVersion V1_16_5 = new DefaultMinecraftServerAPIVersion("1.16.5-R0.1-SNAPSHOT");

    private SpigotServerAPI api;

    public SpigotServer() {
        this.api = new SpigotServerAPI();
    }

    @Override
    public MinecraftServerAPI getAPI() {
        return api;
    }
}

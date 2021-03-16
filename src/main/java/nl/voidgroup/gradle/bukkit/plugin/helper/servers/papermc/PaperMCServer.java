package nl.voidgroup.gradle.bukkit.plugin.helper.servers.papermc;

import nl.voidgroup.gradle.bukkit.plugin.helper.servers.DefaultMinecraftServerAPIVersion;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServer;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPI;

public class PaperMCServer implements MinecraftServer {

    public static final DefaultMinecraftServerAPIVersion V1_13 = new DefaultMinecraftServerAPIVersion("1.13-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_13_1 = new DefaultMinecraftServerAPIVersion("1.13.1-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_13_2 = new DefaultMinecraftServerAPIVersion("1.13.2-R0.1-SNAPSHOT");

    public static final DefaultMinecraftServerAPIVersion V1_14 = new DefaultMinecraftServerAPIVersion("1.14-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_14_1 = new DefaultMinecraftServerAPIVersion("1.14.1-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_14_2 = new DefaultMinecraftServerAPIVersion("1.14.2-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_14_3 = new DefaultMinecraftServerAPIVersion("1.14.3-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_14_4 = new DefaultMinecraftServerAPIVersion("1.14.4-R0.1-SNAPSHOT");

    public static final DefaultMinecraftServerAPIVersion V1_15 = new DefaultMinecraftServerAPIVersion("1.15-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_15_1 = new DefaultMinecraftServerAPIVersion("1.15.1-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_15_2 = new DefaultMinecraftServerAPIVersion("1.15.2-R0.1-SNAPSHOT");

    public static final DefaultMinecraftServerAPIVersion V1_16_1 = new DefaultMinecraftServerAPIVersion("1.16.1-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_16_2 = new DefaultMinecraftServerAPIVersion("1.16.2-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_16_3 = new DefaultMinecraftServerAPIVersion("1.16.3-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_16_4 = new DefaultMinecraftServerAPIVersion("1.16.4-R0.1-SNAPSHOT");
    public static final DefaultMinecraftServerAPIVersion V1_16_5 = new DefaultMinecraftServerAPIVersion("1.16.5-R0.1-SNAPSHOT");

    private final PaperMCServerAPI api;

    public PaperMCServer() {
        api = new PaperMCServerAPI();
    }
    @Override
    public MinecraftServerAPI getAPI() {
        return api;
    }
}

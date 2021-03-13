package nl.voidgroup.gradle.bukkit.plugin.helper;

public class BukkitPluginLoadTime {
    public static final BukkitPluginLoadTime POSTWORLD = new BukkitPluginLoadTime("POSTWORLD");
    public static final BukkitPluginLoadTime STARTUP = new BukkitPluginLoadTime("STARTUP");

    private final String PR_C_STR_BUKKIT_PLUGIN_LOAD_TIME_ID;

    public BukkitPluginLoadTime(String bukkitPluginLoadTimeID) {
        PR_C_STR_BUKKIT_PLUGIN_LOAD_TIME_ID = bukkitPluginLoadTimeID;
    }

    public String getPluginLoadTimeID() {
        return PR_C_STR_BUKKIT_PLUGIN_LOAD_TIME_ID;
    }
}

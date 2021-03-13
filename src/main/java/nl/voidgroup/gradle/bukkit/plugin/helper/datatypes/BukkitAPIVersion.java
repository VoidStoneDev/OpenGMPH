package nl.voidgroup.gradle.bukkit.plugin.helper;

public class BukkitAPIVersion {
    public static final BukkitAPIVersion V1_13 = new BukkitAPIVersion("1.13");
    public static final BukkitAPIVersion V1_14 = new BukkitAPIVersion("1.14");
    public static final BukkitAPIVersion V1_15 = new BukkitAPIVersion("1.15");
    public static final BukkitAPIVersion V1_16 = new BukkitAPIVersion("1.16");
    private final String PR_C_STR_BUKKIT_API_VERSION_ID;

    public BukkitAPIVersion(String bukkitAPIVersionID) {
        PR_C_STR_BUKKIT_API_VERSION_ID = bukkitAPIVersionID;
    }
    public String getBukkitVersionID() {
        return PR_C_STR_BUKKIT_API_VERSION_ID;
    }
}

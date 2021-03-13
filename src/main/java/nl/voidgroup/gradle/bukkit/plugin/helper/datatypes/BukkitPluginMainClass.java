package nl.voidgroup.gradle.bukkit.plugin.helper;

import java.util.Objects;
import java.util.regex.Pattern;

public class BukkitPluginMainClass {
    private static final Pattern PR_HCC_OBJ_BUKKIT_PLUGIN_MAIN_CLASS_PATTERN = Pattern.compile("^(?!org\\.bukkit\\.)([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$");

    private final String PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING;

    public BukkitPluginMainClass(String bukkitPluginMainClassString) {
        if(bukkitPluginMainClassString == null) throw new RuntimeException("bukkitPluginMainClass cannot be null");
        if(!PR_HCC_OBJ_BUKKIT_PLUGIN_MAIN_CLASS_PATTERN.matcher(bukkitPluginMainClassString).matches()) throw new RuntimeException("Invalid main class, '" + bukkitPluginMainClassString + "' does not match '" + PR_HCC_OBJ_BUKKIT_PLUGIN_MAIN_CLASS_PATTERN.pattern() + "'");
        PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING = bukkitPluginMainClassString;
    }
    private BukkitPluginMainClass(BukkitPluginMainClass bukkitPluginMainClass) {
        PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING = bukkitPluginMainClass.PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING;
    }

    @Override
    public BukkitPluginMainClass clone() {
        return new BukkitPluginMainClass(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BukkitPluginMainClass that = (BukkitPluginMainClass) o;
        return Objects.equals(PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING, that.PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING);
    }

    public String getBukkitPluginMainClassString() {
        return PR_C_STR_BUKKIT_PLUGIN_MAIN_CLASS_STRING;
    }
}

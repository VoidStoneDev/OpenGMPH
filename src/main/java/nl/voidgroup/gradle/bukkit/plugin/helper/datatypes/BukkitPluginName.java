package nl.voidgroup.gradle.bukkit.plugin.helper;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.regex.Pattern;

public class BukkitPluginName {
    private static final Pattern PR_HCC_OBJ_BUKKIT_PLUGIN_NAME_PATTERN = Pattern.compile("^[A-Za-z0-9_.-]+$");
    private final String PR_C_STR_BUKKIT_PLUGIN_NAME_STRING;

    public BukkitPluginName(String bukkitPluginNameString) {
        if(bukkitPluginNameString == null) throw new RuntimeException("bukkitPluginNameString cannot be null");
        if(!PR_HCC_OBJ_BUKKIT_PLUGIN_NAME_PATTERN.matcher(bukkitPluginNameString).matches()) throw new RuntimeException("Invalid plugin name, '" + bukkitPluginNameString + "' does not match pattern: '" + PR_HCC_OBJ_BUKKIT_PLUGIN_NAME_PATTERN.pattern() + "'");
        PR_C_STR_BUKKIT_PLUGIN_NAME_STRING = bukkitPluginNameString;
    }
    private BukkitPluginName(BukkitPluginName bukkitPluginName) {
        this.PR_C_STR_BUKKIT_PLUGIN_NAME_STRING = bukkitPluginName.PR_C_STR_BUKKIT_PLUGIN_NAME_STRING;
    }

    @Override
    public BukkitPluginName clone() {
        return new BukkitPluginName(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BukkitPluginName that = (BukkitPluginName) o;
        return Objects.equals(PR_C_STR_BUKKIT_PLUGIN_NAME_STRING, that.PR_C_STR_BUKKIT_PLUGIN_NAME_STRING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PR_C_STR_BUKKIT_PLUGIN_NAME_STRING);
    }

    public String getBukkitPluginNameString() {
        return PR_C_STR_BUKKIT_PLUGIN_NAME_STRING;
    }
}

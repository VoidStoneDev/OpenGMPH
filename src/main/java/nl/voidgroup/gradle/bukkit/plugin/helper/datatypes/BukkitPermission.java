package nl.voidgroup.gradle.bukkit.plugin.helper;

import java.util.Objects;
import java.util.regex.Pattern;

public class BukkitPermission {
    private static final Pattern PR_HCC_OBJ_BUKKIT_PERMISSION_PATTERN = Pattern.compile("^[a-z]+(\\.[a-z]+)*");

    private final String PR_C_STR_BUKKIT_PERMISSION_STRING;

    public BukkitPermission(String bukkitPermissionString) {
        if(bukkitPermissionString == null) throw new RuntimeException("bukkitPermissionString cannot be null");
        if(!PR_HCC_OBJ_BUKKIT_PERMISSION_PATTERN.matcher(bukkitPermissionString).matches()) throw new RuntimeException("Invalid permission, '" + bukkitPermissionString + "' does not match '" + PR_HCC_OBJ_BUKKIT_PERMISSION_PATTERN.pattern() + "'");
        PR_C_STR_BUKKIT_PERMISSION_STRING = bukkitPermissionString;
    }

    private BukkitPermission(BukkitPermission bukkitPermission) {
        PR_C_STR_BUKKIT_PERMISSION_STRING = bukkitPermission.PR_C_STR_BUKKIT_PERMISSION_STRING;
    }

    @Override
    public BukkitPermission clone() {
        return new BukkitPermission(this);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        BukkitPermission that = (BukkitPermission) o;
        return Objects.equals(PR_C_STR_BUKKIT_PERMISSION_STRING, that.PR_C_STR_BUKKIT_PERMISSION_STRING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PR_C_STR_BUKKIT_PERMISSION_STRING);
    }
    
}

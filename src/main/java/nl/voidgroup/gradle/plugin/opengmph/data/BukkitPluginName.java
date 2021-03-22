package nl.voidgroup.gradle.plugin.opengmph.data;

import nl.voidgroup.gradle.plugin.opengmph.Util;

import java.util.regex.Pattern;

public class BukkitPluginName {

    public static final Pattern pattern = Pattern.compile("^[A-Za-z0-9_.-]+$");

    private final String stringName;

    public BukkitPluginName(String pluginName) {
        stringName = Util.requireNonNull(pluginName, "pluginName cannot be null");
        if(!pattern.matcher(pluginName).matches()) throw new IllegalArgumentException("pluginName is invalid, '" + stringName + "' must match '" + pattern.pattern() + "'");
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof BukkitPluginName)) return false;
        BukkitPluginName cObj = (BukkitPluginName) obj;
        return stringName.equals(cObj.stringName);
    }
    @Override
    public BukkitPluginName clone() throws CloneNotSupportedException {
        return (BukkitPluginName) super.clone();
    }

    public String getString() {
        return stringName;
    }

}

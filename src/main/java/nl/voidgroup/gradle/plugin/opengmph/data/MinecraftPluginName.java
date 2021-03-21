package nl.voidgroup.gradle.plugin.opengmph.data;

import nl.voidgroup.gradle.plugin.opengmph.Util;
import nl.voidgroup.gradle.plugin.opengmph.exception.InvalidArgumentException;

import java.util.regex.Pattern;

public class MinecraftPluginName implements MinecraftDataType {

    public static final Pattern pattern = Pattern.compile("^[A-Za-z0-9_.-]+$");

    private final String stringName;

    public MinecraftPluginName(String pluginName) {
        stringName = Util.requireNonNull(pluginName, "pluginName cannot be null");
        if(!pattern.matcher(pluginName).matches()) throw new InvalidArgumentException("pluginName is invalid, '" + stringName + "' must match '" + pattern.pattern() + "'");
    }


    @Override
    public boolean equals(MinecraftDataType obj) {
        if(obj == null) return false;
        if(!(obj instanceof MinecraftPluginName)) return false;
        MinecraftPluginName cObj = (MinecraftPluginName) obj;
        return stringName.equals(cObj.stringName);
    }
    @Override
    public MinecraftDataType clone() throws CloneNotSupportedException {
        return (MinecraftDataType) super.clone();
    }
    @Override
    public String getString() {
        return stringName;
    }
}

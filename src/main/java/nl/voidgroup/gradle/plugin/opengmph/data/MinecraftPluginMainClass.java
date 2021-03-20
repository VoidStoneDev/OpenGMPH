package nl.voidgroup.gradle.plugin.opengmph.data;

import nl.voidgroup.gradle.plugin.opengmph.Util;
import nl.voidgroup.gradle.plugin.opengmph.exception.InvalidArgumentException;

import java.util.regex.Pattern;

public class MinecraftPluginMainClass implements MinecraftDataType {

    public static final Pattern pattern = Pattern.compile("^(?!org\\.bukkit\\.)([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$]*$");

    private final String stringMainClass;

    public MinecraftPluginMainClass(String pluginMainClass) {
        stringMainClass = Util.requireNonNull(pluginMainClass, "pluginMainClass cannot be null");
        if(!pattern.matcher(pluginMainClass).matches()) throw new InvalidArgumentException("pluginMainClass is invalid, '" + stringMainClass + "' must match '" + pattern.pattern() + "'");
    }

    @Override
    public boolean equals(MinecraftDataType obj) {
        if(obj == null) return false;
        if(!(obj instanceof MinecraftPluginMainClass)) return false;
        MinecraftPluginMainClass cObj = (MinecraftPluginMainClass) obj;
        return stringMainClass.equals(cObj.stringMainClass);
    }
    @Override
    public MinecraftDataType clone() throws CloneNotSupportedException{
        return (MinecraftDataType) super.clone();
    }

    @Override
    public String getString() {
        return stringMainClass;
    }
}

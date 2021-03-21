package nl.voidgroup.gradle.plugin.opengmph.data;

import nl.voidgroup.gradle.plugin.opengmph.Util;

public class DefaultMinecraftServerVersion implements MinecraftServerVersion{

    private final String stringVersion;

    public DefaultMinecraftServerVersion(String version) {
        stringVersion = Util.requireNonNull(version, "pluginName cannot be null");
    }

    @Override
    public String getString() {
        return stringVersion;
    }
}

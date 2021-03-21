package nl.voidgroup.gradle.plugin.opengmph;

import groovy.lang.Closure;
import nl.voidgroup.gradle.plugin.opengmph.data.MinecraftServerVersion;
import nl.voidgroup.gradle.plugin.opengmph.server.MinecraftServer;

public class PluginHelperData {
    public boolean importAPI = true;
    public boolean genPluginYML = true;

    public MinecraftServer targetServer;
    public MinecraftServerVersion targetVersion;
    public Closure<?> pluginData;

    public void pluginData(Closure<?> closure) {
        this.pluginData = closure;
    }
}

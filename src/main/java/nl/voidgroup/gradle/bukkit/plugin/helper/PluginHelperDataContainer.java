package nl.voidgroup.gradle.bukkit.plugin.helper;


import groovy.lang.Closure;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServer;
import nl.voidgroup.gradle.bukkit.plugin.helper.servers.MinecraftServerAPIVersion;
import org.gradle.api.Action;
import org.gradle.util.ConfigureUtil;

public class PluginHelperDataContainer {
    public PluginDataContainer pluginData;
    public MinecraftServer targetServer;
    public MinecraftServerAPIVersion targetAPIVersion;

    public boolean addDependencies = true;

    PluginDataContainer getPluginData() {
        return pluginData;
    }

    public void pluginData(Closure config) {
        ConfigureUtil.configure(config, pluginData);
    }
    public void pluginData(Action<? super PluginDataContainer> config) {
        config.execute(pluginData);
    }


    public static class PluginDataContainer {
        public String test;

    }

}

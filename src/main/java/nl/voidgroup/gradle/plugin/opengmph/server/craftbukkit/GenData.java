package nl.voidgroup.gradle.plugin.opengmph.server.craftbukkit;

import nl.voidgroup.gradle.plugin.opengmph.data.BukkitPluginName;

public class GenData {
    public BukkitPluginName name;
    public void name(String name) {
        this.name = new BukkitPluginName(name);
    }
}

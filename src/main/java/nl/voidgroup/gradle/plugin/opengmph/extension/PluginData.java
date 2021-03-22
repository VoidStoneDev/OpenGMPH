package nl.voidgroup.gradle.plugin.opengmph.extension;

import groovy.lang.Closure;
import nl.voidgroup.gradle.plugin.opengmph.Util;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftServer;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.MinecraftVersion;

public class PluginData {
    public MinecraftServer targetServer;
    public MinecraftVersion targetVersion;
    public boolean importRepo = true;
    public boolean importDep = true;
    public boolean genYML = true;
    public Closure<?> genData;
    public void targetServer(String server) {
        targetServer = Util.requireNonNull(MinecraftServer.getByName(server), "Invalid target server");
    }
    public void targetServer(MinecraftServer server) {
        targetServer = Util.requireNonNull(server, "Server cannot be null");
    }
    public void targetVersion(String version) {
        targetVersion = Util.requireNonNull(MinecraftVersion.getByName(version), "Invalid target version");
    }
    public void targetVersion(MinecraftVersion version) {
        targetVersion = Util.requireNonNull(version, "Version cannot be null");
    }
    public void genData(Closure<?> closure) {
        genData = closure;
    }
}

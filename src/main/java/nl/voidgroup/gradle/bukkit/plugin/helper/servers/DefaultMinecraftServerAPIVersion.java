package nl.voidgroup.gradle.bukkit.plugin.helper.servers;

public class DefaultMinecraftServerAPIVersion implements MinecraftServerAPIVersion{

    private final String version;

    public DefaultMinecraftServerAPIVersion(String version) {
        this.version = version;
    }

    @Override
    public String getString() {
        return version;
    }
}

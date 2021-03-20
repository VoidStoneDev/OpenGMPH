package nl.voidgroup.gradle.plugin.opengmph.data;

public interface MinecraftArrayDataType extends MinecraftDataType {
    MinecraftDataType[] toArray();
    String[] toStringArray();
}

package nl.voidgroup.gradle.plugin.opengmph.data.minecraft;

public abstract class MinecraftDataType {
    public MinecraftDataType(String str) {
        fromString(str);
    }

    public abstract MinecraftDataType fromString(String str);

    public abstract String getString();
}

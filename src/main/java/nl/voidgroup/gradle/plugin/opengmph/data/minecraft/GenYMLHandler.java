package nl.voidgroup.gradle.plugin.opengmph.data.minecraft;

import nl.voidgroup.gradle.plugin.opengmph.data.YMLObject;
import nl.voidgroup.gradle.plugin.opengmph.extension.PluginData;

public abstract class GenYMLHandler {
    public GenYMLHandler() {

    }

    public abstract YMLObject run(PluginData data);
}

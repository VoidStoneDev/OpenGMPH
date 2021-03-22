package nl.voidgroup.gradle.plugin.opengmph.server.craftbukkit;

import nl.voidgroup.gradle.plugin.opengmph.Util;
import nl.voidgroup.gradle.plugin.opengmph.data.YMLObject;
import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.GenYMLHandler;
import nl.voidgroup.gradle.plugin.opengmph.extension.PluginData;

public class Handler extends GenYMLHandler {

    @Override
    public YMLObject run(PluginData data) {
        YMLObject out = new YMLObject();
        GenData genData = new GenData();
        data.genData.setDelegate(genData);
        data.genData.call();
        out.add("name", Util.requireNonNull(genData.name, "plugin name not set").getString());
        return out;
    }
}

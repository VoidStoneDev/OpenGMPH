package nl.voidgroup.gradle.plugin.opengmph.data.minecraft;

public enum MinecraftVersion {
    V1_8,
    V1_9,
    V1_10,
    V1_11,
    V1_12,
    V1_13,
    V1_14,
    V1_15,
    V1_16;

    public static MinecraftVersion getByName(String name) {
        switch (name.toLowerCase()) {
            case "1.8":
                return V1_8;
            case "1.9":
                return V1_9;
            case "1.10":
                return V1_10;
            case "1.11":
                return V1_11;
            case "1.12":
                return V1_12;
            case "1.13":
                return V1_13;
            case "1.14":
                return V1_14;
            case "1.15":
                return V1_15;
            case "1.16":
                return V1_16;
            default:
                return null;
        }
    }

}

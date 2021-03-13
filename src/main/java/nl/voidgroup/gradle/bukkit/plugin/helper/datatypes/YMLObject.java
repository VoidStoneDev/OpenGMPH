package nl.voidgroup.gradle.bukkit.plugin.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class YMLObject {
    private HashMap<String, Object> PR_GF_OBJ_OBJECT_CONTENT;

    public YMLObject() {
        PR_GF_OBJ_OBJECT_CONTENT = new HashMap<>();
    }

    public String getStr(int indent) {
        StringBuilder out = new StringBuilder();
        for(Map.Entry<String, Object> map : PR_GF_OBJ_OBJECT_CONTENT.entrySet()) {

            if(map.getValue() instanceof String[]) {
                out.append(" ".repeat(indent * 2) + map.getKey() + ": \n");
                Iterator iterator = Arrays.stream(((String[]) map.getValue())).iterator();
                while(iterator.hasNext()) {
                    out.append(" ".repeat(indent * 2) + "  - " + iterator.next() + "\n");
                }
                continue;
            }
            if(map.getValue() instanceof YMLObject) {
                out.append(" ".repeat(indent * 2) + map.getKey() + ": \n");
                out.append(((YMLObject) map.getValue()).getStr(indent + 1));
                continue;
            }
            out.append(" ".repeat(indent * 2) + map.getKey() + ": " + map.getValue() + "\n");

        }
        return out.toString();
    }

    public YMLObject add(String str, Object val) {
        PR_GF_OBJ_OBJECT_CONTENT.put(str, val);
        return this;
    }

}

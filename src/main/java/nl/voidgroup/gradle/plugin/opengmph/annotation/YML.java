package nl.voidgroup.gradle.plugin.opengmph.annotation;

import nl.voidgroup.gradle.plugin.opengmph.data.minecraft.GenYMLHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface YML {
    String file() default "plugin.yml";
    Class<? extends GenYMLHandler> handler();
}

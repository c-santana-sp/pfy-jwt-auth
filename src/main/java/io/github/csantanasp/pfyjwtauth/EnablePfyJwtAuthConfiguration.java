package io.github.csantanasp.pfyjwtauth;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(PfyJwtAuthConfiguration.class)
public @interface EnablePfyJwtAuthConfiguration {
}

package io.github.csantanasp.pfyjwtauth;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ConditionalOnProperty(value = "com.github.csantanasp.pfyjwtauth", havingValue = "true", matchIfMissing = true)
public class PfyJwtAuthConfiguration {
}

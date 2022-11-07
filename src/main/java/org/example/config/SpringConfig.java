package org.example.config;

import org.example.model.Sfinks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {

    @Bean(value = "hairless")
    @Scope("prototype")
    public Sfinks sfinks() {
        return new Sfinks();
    }
}
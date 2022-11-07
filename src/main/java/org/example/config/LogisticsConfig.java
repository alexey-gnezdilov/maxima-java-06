package org.example.config;

import org.example.services.TransportFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example")
public class LogisticsConfig {
    @Bean("transport-factory")
    @Scope("prototype")
    public TransportFactory transportFactory() {
        return new TransportFactory();
    }
}
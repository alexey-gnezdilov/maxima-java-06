package org.example.config;

import org.example.services.TransportFactory;
import org.springframework.context.annotation.Bean;

public class TransportFactoryConfig {
    @Bean("transport-factory")
    public TransportFactory transportFactory() {
        return new TransportFactory();
    }
}
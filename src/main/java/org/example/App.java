package org.example;

import org.example.config.LogisticsConfig;
import org.example.model.city.City;
import org.example.model.transport.Transport;
import org.example.services.Logistics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LogisticsConfig.class);
        Transport transport = context.getBean(Logistics.class).getShipping(
                new City("Irkuts", 50, true, true),
                50,
                2
        );
        System.out.println(transport);
    }
}
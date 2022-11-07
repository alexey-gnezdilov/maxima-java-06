package org.example;

import org.example.config.SpringConfig;
import org.example.model.Manul;
import org.example.model.Place;
import org.example.model.Sfinks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Manul murzik = context.getBean(Manul.class);
//        //Sfinks ramzes = context.getBean(Sfinks.class);
//        Sfinks ramzes = (Sfinks) context.getBean("hairless");
//
//
//        Manul murka = context.getBean(Manul.class);
//
//
//        System.out.println(murzik);
//        System.out.println(ramzes);
//        System.out.println(murka);
//
//        murka.setName("Мурка");
//        System.out.println(murzik.getName());
//        System.out.println(murzik==murka);

        Place place = context.getBean(Place.class);
        System.out.println(place.getCat1());
        System.out.println(place.getCat2());
    }
}
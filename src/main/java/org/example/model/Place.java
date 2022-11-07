package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Place {

    @Autowired
    private Manul cat1;

    @Autowired
    private Sfinks cat2;

//    public Place(){}
//
//    @Autowired
//    public Place(Manul cat) {
//        this.cat = cat;
//    }

    public Manul getCat1() {
        return cat1;
    }

    public Sfinks getCat2() {
        return cat2;
    }
}
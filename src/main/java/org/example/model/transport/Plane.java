package org.example.model.transport;

import org.example.model.city.City;

public class Plane extends Transport{

    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    public float getPrice(City city) {
        return city.hasAirport() ? city.getDistanceKm() * getCostOfKm() : 0;
    }
}

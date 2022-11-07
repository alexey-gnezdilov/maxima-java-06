package org.example.services;

import org.example.model.city.City;
import org.example.model.transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logistics {

    //свойство - все транспортные средства
    private Transport[] vehicles;
    private TransportFactory transportFactory;

    //Конструктор по умолчанию
    public Logistics(){}

    //Конструктор, принимающий произвольное число паарметров (транспортные средства)
    @Autowired
    public Logistics(TransportFactory transportFactory, Transport... transports) {
        vehicles = transports;
        this.transportFactory = transportFactory;
    }

    //Получить самое оптимальное по стоимости доставки транспортное средство
    public Transport getShipping(City city, int weight, int hours) {
        Transport minCostTransport = null;
        for (Transport vehicle : vehicles) {
            if (isShippingAvailable(city, vehicle, weight, hours)) {
                if (minCostTransport == null) {
                    minCostTransport = vehicle;
                } else if (vehicle.getCostOfKm() < minCostTransport.getCostOfKm()) {
                    minCostTransport = vehicle;
                }
            }
        }
        if (minCostTransport == null) {
            minCostTransport = transportFactory.getTransport(city, weight, hours);
        }
        return minCostTransport;
    }

    //Проверка - доступна ли доставка для транспорта в указанный город
    private boolean isShippingAvailable(City city, Transport transport, int weight, int hours) {
        return !transport.isRepairing()
                && transport.getCapacity() >= weight
                && (float) city.getDistanceKm() / transport.getSpeed() <= (float) hours
                && transport.getPrice(city) != 0f;
    }
}
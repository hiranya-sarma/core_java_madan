package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Vehicle;
import com.eazybytes.marvel.vehicle.Car;

public class TestMethodHiding {

    public static void main(String[] args) {
        Car car = new Car();
        Car.start();
        car.start();
        ((Vehicle)car).start();


        Vehicle vehicle = car;
        vehicle.start();
        ((Car)vehicle).start();


    }
}

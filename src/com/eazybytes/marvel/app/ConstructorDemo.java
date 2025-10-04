package com.eazybytes.marvel.app;

import com.eazybytes.marvel.subjects.Mathematics;
import com.eazybytes.marvel.vehicle.Car;

public class ConstructorDemo {
    public static void main(String[] args) {
          Car car = new Car();
        System.out.println(car.madeFor);
        //System.out.println(car.makeHorn());
        car.makeHorn();
        Mathematics math = new Mathematics();
        math.teach();
        System.out.println("Minimum static marks: "+math.getMinimumMarks());
    }
}

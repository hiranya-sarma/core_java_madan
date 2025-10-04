package com.eazybytes.marvel.vehicle;

import com.eazybytes.marvel.base.Vehicle;

public class Car extends Vehicle {

    public int horsePower;
    public String color;
    public double turningRadius;
    public boolean isAutomatic;

    public Car() {
        super("Car-Water");
        System.out.println("Inside Car default constructor");
        horsePower = 150;
        color = "Black";
        turningRadius = 6.23;
        isAutomatic = true;
    }

    public static void  start() {
        System.out.println("Car is starting...");
    }

    public void printCarDetails() {
        System.out.println("Super color is " + super.color);
        System.out.println("Car color is " + color + " and horse power is " + horsePower);
    }

    public void makeHorn() {
        super.makeHorn();
        System.out.println("The car horns");
    }

}

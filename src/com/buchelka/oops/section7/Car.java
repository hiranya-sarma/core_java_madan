package com.buchelka.oops.section7;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";
    private int doors;
    private boolean convertible = true;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Doors: " + doors);
        System.out.println("Convertible: " + convertible);
    }
}

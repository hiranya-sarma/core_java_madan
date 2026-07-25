package com.animatedguide.exceptiondemo.finaldemo;

public class BlankFinalDemo {

    final String registrationNumber;

    final String model;


    {
        System.out.println("Inside instance initializer block");

        registrationNumber = "REG-"+Math.round(Math.random()*10000);
    }

    public BlankFinalDemo(String model) {
        System.out.println("Inside constructor");
        this.model = model;
    }

    public void display() {
        System.out.println("Registration Number: "+registrationNumber);
        System.out.println("Model: "+model);
    }
}

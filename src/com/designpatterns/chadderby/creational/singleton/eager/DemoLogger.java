package com.designpatterns.chadderby.creational.singleton.eager;

public class DemoLogger {

    // static variable to hold the single instance

    // create the single instance when class is loaded
    public static final DemoLogger instance = new DemoLogger();

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Initializing DemoLogger");
    }

    // public method to return single instance
    public static DemoLogger getInstance() {
        return instance;
    }
    public void log(String message){
        System.out.println(message);
    }
}

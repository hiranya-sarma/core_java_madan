package com.chadderby.designpatterns.creational.singleton.lazy;

public class DemoLogger {

    // static variable to hold the single instance
    public static DemoLogger instance;

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Initializing DemoLogger");
    }

    // public method to return single instance (with lazy initialization)
    public static DemoLogger getInstance() {
        // create instance if doesn't exist
        if(instance == null){
            instance = new DemoLogger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println(message);
    }
}

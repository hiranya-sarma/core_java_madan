package com.designpatterns.chadderby.creational.singleton.billpugh;

public class DemoLogger {

    // static variable to hold the single instance
    public static DemoLogger instance;

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Initializing DemoLogger");
    }

    // Static inner class holds the single instance
    // This inner class is not loaded until getInstance() is called (lazy init)
    // This provides lazy initialization and threadsafe without synchronized
    private static class SingletonHelper{
        private static final DemoLogger INSTANCE = new DemoLogger();
    }

    // public method to return single instance
    public static DemoLogger getInstance() {
       return SingletonHelper.INSTANCE;
    }
    public void log(String message){
        System.out.println(message);
    }
}

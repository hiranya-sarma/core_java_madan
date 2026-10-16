package com.designpatterns.chadderby.creational.singleton.lazy;

public class MainApp {
    public static void main(String[] args) {
        DemoLogger instance1 = DemoLogger.getInstance();
        DemoLogger instance2 = DemoLogger.getInstance();
        instance1.log("Hello World1");
        instance2.log("Hello World2");

        boolean flag = instance1 == instance2;
        System.out.println("Are the logger instances same: "+ flag);
    }
}

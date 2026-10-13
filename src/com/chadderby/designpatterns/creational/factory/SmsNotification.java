package com.chadderby.designpatterns.creational.factory;

public class SmsNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS...");
    }
}

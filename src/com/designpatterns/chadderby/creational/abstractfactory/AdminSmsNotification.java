package com.designpatterns.chadderby.creational.abstractfactory;

public class AdminSmsNotification implements SmsNotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Admin sms notification...");
    }
}

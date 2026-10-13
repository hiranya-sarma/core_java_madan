package com.chadderby.designpatterns.creational.abstractfactory;

public class UserSmsNotification implements SmsNotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending User sms notification...");
    }
}

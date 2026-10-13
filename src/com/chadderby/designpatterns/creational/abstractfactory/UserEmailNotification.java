package com.chadderby.designpatterns.creational.abstractfactory;

public class UserEmailNotification implements EmailNotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending User email notification...");
    }
}

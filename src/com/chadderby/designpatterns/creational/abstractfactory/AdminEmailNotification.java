package com.chadderby.designpatterns.creational.abstractfactory;

public class AdminEmailNotification implements EmailNotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Admin email notification...");
    }
}

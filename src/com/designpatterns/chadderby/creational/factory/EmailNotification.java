package com.designpatterns.chadderby.creational.factory;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email...");
    }
}

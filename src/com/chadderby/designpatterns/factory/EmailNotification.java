package com.chadderby.designpatterns.factory;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email...");
    }
}

package com.designpatterns.chadderby.creational.factory;

public class WhatsappNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending WhatsApp...");
    }
}

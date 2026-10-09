package com.chadderby.designpatterns.factory;

public class WhatsappNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending WhatsApp...");
    }
}

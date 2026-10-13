package com.chadderby.designpatterns.creational.factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {

       if(type == null || type.isEmpty()) {
           return null;
       }

       return switch (type.toLowerCase()){
           case "sms" -> new SmsNotification();
           case "email" -> new EmailNotification();
           case "whatsapp" -> new WhatsappNotification();
           default -> throw new IllegalArgumentException("Invalid notification type");
       };
    }
}

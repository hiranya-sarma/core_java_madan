package com.chadderby.designpatterns.creational.abstractfactory;

public class MainApp {
    public static void main(String[] args) {

        NotificationFactory factory;
        EmailNotification emailNotification;
        SmsNotification smsNotification;

        //sending to user
        factory = new UserNotificationFactory();
        smsNotification = factory.createSmsNotification();
        emailNotification = factory.createEmailNotification();
        smsNotification.notifyUser();
        emailNotification.notifyUser();
        //sending to admin
        factory = new AdminNotificationFactory();
        smsNotification = factory.createSmsNotification();
        emailNotification = factory.createEmailNotification();
        smsNotification.notifyUser();
        emailNotification.notifyUser();


    }
}

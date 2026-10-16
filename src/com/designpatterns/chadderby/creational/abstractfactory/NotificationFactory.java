package com.designpatterns.chadderby.creational.abstractfactory;

public interface NotificationFactory {

    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();
}

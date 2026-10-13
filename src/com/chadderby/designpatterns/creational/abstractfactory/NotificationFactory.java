package com.chadderby.designpatterns.creational.abstractfactory;

public interface NotificationFactory {

    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();
}

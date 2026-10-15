package com.chadderby.designpatterns.creational.prototype;

public class MainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmailTemplate baseTemplate = new EmailTemplate("Hello!", "This is your monthly update", "Regards, XYZ");
        System.out.println("Base template: "+baseTemplate);
        System.out.println();
        System.out.println("SENDING GROUP MAIL");

        EmailTemplate groupEmail = (EmailTemplate) baseTemplate.clone();
        groupEmail.setSubject("Hello Team!");
        groupEmail.sendEmail("techteam@gmail.com");
        System.out.println();

    }
}

package com.designpatterns.chadderby.creational.prototype;

public class EmailTemplate implements Cloneable{
    private String body;
    private String subject;
    private String footer;

    public EmailTemplate(String body, String subject, String footer) {
        this.body = body;
        this.subject = subject;
        this.footer = footer;
    }

    public void sendEmail(String to) {
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println("Footer: " + footer);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // If this class has mutable fields, perform a deep copy here
        // Example clone the 'body' field if it's a mutable object
        return (EmailTemplate)super.clone();
    }

    @Override
    public String toString() {
        return "EmailTemplate{" +
                "body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}

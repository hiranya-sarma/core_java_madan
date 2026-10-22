package com.designpatterns.mypractice.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Document document = new DocumentProxy("confidential.pdf", "ADMIN");
        document.display();
    }
}

package com.globalsoftwaresupport.reentrantlocking;

public class ReentrantExample {
    public synchronized void outerMethod() {
        System.out.println("Entered outerMethod");
        innerMethod(); // Calling another synchronized method
        System.out.println("Exiting outerMethod");
    }

    public synchronized void innerMethod() {
        System.out.println("Entered innerMethod");
        // Do something
        System.out.println("Exiting innerMethod");
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();

        Thread thread = new Thread(() -> {
            example.outerMethod();
        });

        thread.start();
    }
}

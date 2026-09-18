package com.buchelka.threads.basics;

public class Worker {

    private volatile boolean running = true;

    public void stop() {
        running = false;
        System.out.println("Stopping...");
    }

    public void work() {
        while (running) {
            // do work
            System.out.println("Working...");
        }
    }
}

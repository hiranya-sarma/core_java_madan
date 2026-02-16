package com.eazybytes.multithreading;

public class SharedBooleanResource {
    private volatile boolean stopFlag = false;

    public void setStopFlag() {
        this.stopFlag = true;
    }

    public void doWork() {
        while(!stopFlag) {
            System.out.println("Working...");
        }
        System.out.println("Stopped working...");
    }
}

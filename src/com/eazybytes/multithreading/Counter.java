package com.eazybytes.multithreading;

public class Counter {
    private int count = 0;

    public void incrementUnSynchronized() {
        count++;
    }

    public void incrementSynchronized() {
        synchronized (Counter.class) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

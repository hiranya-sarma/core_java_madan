package com.eazybytes.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class SafeCounter {
    int count = 0;
    // Create the lock object
    ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock(); // 1. Lock the door
        try {
            count++; // 2. Do the work safely
        } finally {
            lock.unlock(); // 3. ALWAYS unlock in finally block
        }
    }
}

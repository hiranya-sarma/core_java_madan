package com.globalsoftwaresupport.reentrantlocking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();
    //private ReentrantLock lock = new ReentrantLock(true); // FAIR lock

    /*
    public void increment() {
        lock.lock(); // acquire lock
        try {
            count++;
        }finally {
            lock.unlock(); // always release
        }
    }
     */

    //using tryLock() method
    /*
    public void increment() {
        if (lock.tryLock()) {   // try acquiring lock
            try {
                count++;
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " skipped");
        }
    }
    */
    //using tryLock() method with timeout
    public void increment() {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    count++;
                    Thread.sleep(50); // simulate work
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " timeout");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public int getCount() {
        return count;
    }

}

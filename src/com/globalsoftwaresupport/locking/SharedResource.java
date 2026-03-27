package com.globalsoftwaresupport.locking;

public class SharedResource {
    //object level lock
    public synchronized void objectMethod() {
        System.out.println(Thread.currentThread().getName()+" entered objectMethod");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" exiting objectMethod");
    }

    // Class-level lock
    public static synchronized void classMethod() {
        System.out.println(Thread.currentThread().getName()+" entered classMethod");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" exiting classMethod");
    }
}

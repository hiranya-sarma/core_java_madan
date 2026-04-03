// Java
package com.globalsoftwaresupport.waitandnotify;

public class Process2 {

    private final Object lock = new Object();
    private boolean produced = false;

    public void produce() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Running the produce method...");
            while (!produced) {
                lock.wait(); // wait until consumer signals
            }
            System.out.println("Again in the produce method...");
            // reset state if you want to reuse
            produced = false;
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (lock) {
            System.out.println("Running the consume method...");
            produced = true;
            lock.notifyAll();
            System.out.println("After notify() method call in the consume method...");
        }
    }

    public static void main(String[] args) {
        var process = new Process2();
        var t1 = new Thread(() -> {
            try {
                process.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        });
        var t2 = new Thread(() -> {
            try {
                process.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
package com.buchelka.threads.threadstrvation;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadStarvationFixedDemo {
    //From Gemini
    // Shared resource lock
    //private static final Object lock = new Object();
    private static final ReentrantLock fiarLock = new ReentrantLock(true);

    public static void main(String[] args) {

        // High-priority thread that aggressively hog the lock
        Thread greedyThread = new Thread(()->{
            int count = 0;
            while(true){
                fiarLock.lock();
                try {
                    count++;
                    System.out.println("Greedy Thread acquired lock. Execution count: " + count);
                        // Holds lock and does work without giving other threads a fair chance
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        fiarLock.unlock();
                    }

                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }


                } // Lock released, but loop immediately tries to re-acquire it!
                

        }, "Greedy-Thread");

        // Low-priority thread that gets starved
        Thread starvedThread = new Thread(() -> {
            int count = 0;
            while (true) {
                fiarLock.lock();
                    try {
                        count++;
                        System.out.println(">>> STARVED THREAD FINALLY GOT THE LOCK! Execution count: " + count);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        fiarLock.unlock();
                    }

                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }

        }, "Starved-Thread");

        // Assign extreme priorities to demonstrate thread scheduler bias
        greedyThread.setPriority(Thread.MAX_PRIORITY); // Priority 10
        starvedThread.setPriority(Thread.MIN_PRIORITY); // Priority 1

        // Start both threads
        greedyThread.start();
        starvedThread.start();
    }

}

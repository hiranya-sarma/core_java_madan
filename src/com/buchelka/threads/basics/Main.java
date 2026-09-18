package com.buchelka.threads.basics;

public class Main {
    public static void main(String[] args) {
//        new Thread(() -> useBathroom("Alice")).start();
//        new Thread(() -> useBathroom("Bob")).start();
        Worker worker = new Worker();

        /*
        Thread alice = new Thread(new BasicSynchronizedDemo("Alice1"));
        Thread bob = new Thread(new BasicSynchronizedDemo("Bob1"));
        alice.start();
        bob.start();
        */


        Thread t1 = new Thread(worker::work);
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(5);
                worker.stop();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();


    }
}

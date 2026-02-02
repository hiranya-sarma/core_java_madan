package com.eazybytes.thread;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceBeginner {
    public static void main(String[] args) throws InterruptedException {

        AtomicReference<String> status = new AtomicReference<>("START");

        Thread worker1 = new Thread(()->{
            status.set("PROCESSING");
        });

        Thread worker2 = new Thread(()->{
           status.set("DONE");
        });

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        System.out.println("Final status "+status.get());

    }
}

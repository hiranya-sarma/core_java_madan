package com.globalsoftwaresupport.mypractice;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                var q = queue.take();
                System.out.println("Consuming mine: " + q);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

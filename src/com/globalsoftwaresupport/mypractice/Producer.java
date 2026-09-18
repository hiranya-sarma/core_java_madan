package com.globalsoftwaresupport.mypractice;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<Integer> queue;
    private int i=0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            i++;
            try {
                queue.put(i);
                System.out.println("Produced mine: " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

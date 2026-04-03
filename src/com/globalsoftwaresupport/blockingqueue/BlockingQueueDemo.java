package com.globalsoftwaresupport.blockingqueue;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                System.out.println("Producing: " + i);
                queue.put(i); // blocks if full
                Thread.sleep(1000);
                System.out.println("Produced: " + i);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run(){
        try {
            while(true) {
                Integer value = queue.take();
                System.out.println("Consuming: " + value);
                Thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class BlockingQueueDemo {
    public static void main(String[] args) {
       BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
       new Thread(new Producer(queue)).start();
       new Thread(new Consumer(queue)).start();
    }
}

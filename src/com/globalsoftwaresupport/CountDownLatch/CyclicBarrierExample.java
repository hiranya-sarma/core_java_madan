package com.globalsoftwaresupport.CountDownLatch;

import java.util.concurrent.CyclicBarrier;

class Worker1 implements Runnable{
    private CyclicBarrier barrier;
    private int id;

    public Worker1(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Worker " + id + " doing work...");
        try{
           Thread.sleep(1000 * id); // simulate different speeds
            System.out.println("Worker " + id + " waiting at barrier");
            barrier.await(); // wait for others
            System.out.println("Worker " + id + " passed barrier");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
public class CyclicBarrierExample {
    public static void main(String[] args) {
         CyclicBarrier barrier = new CyclicBarrier(3);
         for(int i = 1; i <= 3; i++) {
             new Thread(new Worker1(barrier, i)).start();
         }
    }
}

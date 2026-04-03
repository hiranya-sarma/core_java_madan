package com.globalsoftwaresupport.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
    private CountDownLatch latch;
    private int id;

    public Worker(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Worker " + id + " started");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker " + id + " finished");
        latch.countDown(); //reduce the count
    }
}
class Task implements Runnable{
    private CountDownLatch latch;
    private int id;

    public Task(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Task " + id + " started by " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("Task " + id + " completed");

        latch.countDown();
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        //-------------------Basic Example (Understanding Concept)---------------------------
        /*
        CountDownLatch latch = new CountDownLatch(3);
        for(int i=0; i<3; ++i){
            new Thread(new Worker(latch,i)).start();
        }
        System.out.println("Main thread waiting...");
        latch.await();// wait until count = 0
        System.out.println("Main thread finished");
        */
        //----------------------Intermediate Example (Using ExecutorService)-----------------
        ExecutorService service = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(5);
        for(int i=1; i<=5; i++){
            service.submit(new Task(latch, i));
        }
        System.out.println("Main waiting...");
        latch.await();
        System.out.println("All tasks completed!");
        service.shutdown();

    }
}




























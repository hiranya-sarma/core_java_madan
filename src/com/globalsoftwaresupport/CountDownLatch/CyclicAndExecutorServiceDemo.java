package com.globalsoftwaresupport.CountDownLatch;


import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Player2 implements Runnable{
    private String name;
    private CyclicBarrier barrier;

    public Player2(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }
    @Override
    public void run() {
        try {
            System.out.println(name + " loading game...");
            System.out.println(name + " ready, waiting for others");
            Thread.sleep((int)(Math.random() * 2000));
            barrier.await();
            System.out.println(name + " started playing!");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
public class CyclicAndExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3,() -> {
            System.out.println("All players ready. Game starts!");
        });
        for(int i = 1; i <= 3; i++) {
            executorService.submit(new Player2("Player " + i, barrier));
        }
        executorService.shutdown();

    }
}

package com.globalsoftwaresupport.CountDownLatch;


import java.util.concurrent.CyclicBarrier;

class Player implements Runnable{
    CyclicBarrier barrier;
    private String name;

    public Player(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
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

public class CyclicPlyaerDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,() -> {
            System.out.println("All players ready. Game starts!");
        });
        for(int i = 1; i <= 3; i++) {
            new Thread(new Player(barrier, "Player " + i)).start();
        }
    }
}

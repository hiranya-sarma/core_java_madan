package com.globalsoftwaresupport.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingBehaviorDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        //Producer
        new Thread(()->{
            int i=1;
            try{
                while(true){
                    System.out.println("Producing: " + i);
                    queue.put(i);
                    i++;
                    Thread.sleep(200);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }).start();

        //Consumer
        new Thread(()->{
            try{
                while(true){
                    Thread.sleep(2000); //slow down the consumer
                    System.out.println("Consuming: " + queue.take());

                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();

    }
}

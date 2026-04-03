package com.globalsoftwaresupport.blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(3);

        Runnable producer = ()->{
          try{
              int i=0;
              while(true){
                  String item = "Item " + i++;
                  queue.put(item);
                  System.out.println("Produced: " + item);
                  Thread.sleep(500);
              }

          }catch(Exception e){
              System.out.println(e.getMessage());
          }
        };

        Runnable consumer = ()->{
            try{
                while(true){
                    String item = queue.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(1000);
                }

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

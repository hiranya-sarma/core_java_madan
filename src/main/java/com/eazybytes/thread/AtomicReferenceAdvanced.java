package com.eazybytes.thread;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceAdvanced {
    public static void main(String[] args) throws InterruptedException {
        AtomicReference<Integer> stock = new AtomicReference<>(10);

        Runnable buyerTask = () -> {
            while(true){
              Integer currentStock = stock.get();
              if(currentStock == 0){
                 System.out.println("Stock is empty");
                 break;
              }
                boolean updated = stock.compareAndSet(currentStock,currentStock-1);
              if(updated){
                  //System.out.println("Stock is updated");
                  System.out.println(Thread.currentThread().getName()+ " bought 1 item. Remaining: " + (currentStock-1));
                  break;
              }
            }

        };

        Thread buyer1 = new Thread(buyerTask,"Buyer-1");
        Thread buyer2 = new Thread(buyerTask,"Buyer-2");
        Thread buyer3 = new Thread(buyerTask,"Buyer-3");

        buyer1.start();
        buyer2.start();
        buyer3.start();

        buyer1.join();
        buyer2.join();
        buyer3.join();

        System.out.println("Final stock: " + stock.get());

    }
}

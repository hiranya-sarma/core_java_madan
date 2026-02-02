package com.eazybytes.thread;

public class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available){
            try {
                wait(); // wait until consumed
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume(){
       while (!available){
           try {
               wait(); // wait until produced
           }catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
       }
        available = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }

}

package com.globalsoftwaresupport.waitandnotify;

public class Process {

    public void produce() throws InterruptedException {
        synchronized(this) {
            System.out.println("Running the produce method...");
            wait();
            System.out.println("Again in the produce method...");
        }
    }

    public void consume() throws InterruptedException{
        Thread.sleep(1000);
        synchronized(this) {
            System.out.println("Running the consume method...");
            notify();
            System.out.println("After notify() method call in the consume method...");
        }

    }

    public static void main(String[] args) {
         var process = new Process();
         var t1 = new Thread(()->{
            try{
                process.produce();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
         });
        var t2 = new Thread(()->{
            try{
                process.consume();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}

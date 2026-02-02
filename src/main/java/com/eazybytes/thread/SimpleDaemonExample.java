package com.eazybytes.thread;

public class SimpleDaemonExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Worker thread: " + i);
            }
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
        });
        worker.setDaemon(true);
        worker.start();
        System.out.println("Main thread waiting...");
        worker.join(2000);
        System.out.println("Main thread finished");

    }
}

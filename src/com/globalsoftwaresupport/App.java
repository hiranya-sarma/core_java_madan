package com.globalsoftwaresupport;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Thread t1 = new Thread(()->{
            for(int i=0; i<10; ++i) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Runner 1: "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<10; ++i) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Runner 2: "+i);
            }
        });
        t1.start();
        t2.start();
        //list all the threads in JVM
       // Thread.getAllStackTraces().keySet().forEach(System.out::println);
        for(Thread thread: Thread.getAllStackTraces().keySet()){
            System.out.println("Thread name: "+thread.getName()+ " Thread state: "+thread.getState());
        }
        //main thread will wait till both threads are finished
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finished with all runners");

    }
}

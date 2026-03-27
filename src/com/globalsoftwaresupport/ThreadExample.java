package com.globalsoftwaresupport;

public class ThreadExample {
    private static int counter1 = 0;
    private static int counter2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private void increment1() {
        synchronized (lock1) {
            counter1++;
        }
    }
    private void increment2() {
        synchronized (lock2) {
            counter2++;
        }
    }
    public void execute() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; ++i){
                    increment1();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; ++i){
                    increment2();
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Counter1: "+counter1);
        System.out.println("Counter2: "+counter2);
    }
    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        te.execute();
    }
}

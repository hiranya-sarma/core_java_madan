package com.eazybytes.multithreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(()-> System.out.println("Hello from Java Thread"));
        thread1.start();

        Runnable runnable = () -> System.out.println("Hi from Java Runnable");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        HelloThread thread3 = new HelloThread();
        thread3.start();

        Thread thread4 = new Thread(new HelloThread1());
        thread4.start();

        Thread thread5 = new Thread(Hello::sayHello);
        thread5.start();


        System.out.println("Hello from Main Thread");

        NewThread newThread = new NewThread();
        newThread.start();

        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0; i<10000; i++){
                counter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<10000; i++){
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter value: "+counter.count);

        Thread tt1 = new Thread(()->{
            for(int i=1; i<400; i++){
                System.out.println("tt1: "+i);
            }
        });

        Thread tt2 = new Thread(()->{
            for(int i=400; i<=500; i++){
                System.out.println("tt2: "+i);
            }
        });
        tt1.start();
        tt1.join();
        tt2.start();
        tt2.join();


    }

    private static class NewThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello from "+Thread.currentThread().getName());
        }
    }

    private static class Vault{
        private int password;
        public void Vault(int password){
            this.password = password;
        }

        public boolean isCorrectPassword(int guess){
            try {
              Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            return this.password == guess;
        }
    }

    private static abstract class HackerThread extends Thread{
        private Vault vault;
        public HackerThread(Vault vault){
            this.vault = vault;
        }
    }


}

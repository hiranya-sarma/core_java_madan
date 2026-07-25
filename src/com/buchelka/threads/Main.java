package com.buchelka.threads;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Thrad demo");

        CustomThread customThread = new CustomThread();
        customThread.start();

        Runnable myRunnable = () -> {
            for(int i=1; i<=8; i++){
                System.out.println(" 2 ");
                try {
                    TimeUnit.SECONDS.sleep(250);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread mythread = new Thread(myRunnable);
        mythread.start();

        for(int i=1; i<=3; i++){
           System.out.println(" 0 ");
           try{
            TimeUnit.SECONDS.sleep(1);
           }catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
}

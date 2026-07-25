package com.buchelka.threads;

public class CustomThread extends Thread{

    @Override
    public void run() {
      //  System.out.println("Custom Thread");

        for(int i=1; i<=5; i++) {
            System.out.println(" 1 ");

            try{
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

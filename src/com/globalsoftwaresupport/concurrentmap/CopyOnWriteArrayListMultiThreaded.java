package com.globalsoftwaresupport.concurrentmap;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMultiThreaded {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        Runnable writeTask = ()->{
            for(int i=0;i<5;i++){
                list.add(i);
                System.out.println("Added "+i);
            }
        };

        Runnable readTask = ()->{
//            for(int i=0;i<5;i++){
//                System.out.println("Read "+list.get(i));
//            }
            //above code will throw ConcurrentModificationException, please see NOTES.txt for more details

            for(Integer i: list){
                System.out.println("Read "+i);
            }
        };
        Thread t1 = new Thread(writeTask);
        Thread t2 = new Thread(readTask);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

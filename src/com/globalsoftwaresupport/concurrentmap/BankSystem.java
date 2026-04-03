package com.globalsoftwaresupport.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class BankSystem {
    static ConcurrentMap<String, Integer> accounts = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException{
        accounts.put("user1", 1000);

        Runnable task = ()->{
            for(int i=0;i<100;i++){
                int balance = accounts.get("user1");
                balance +=10;
               // accounts.put("user1", balance);
                accounts.compute("user1", (k,v)->v+10);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final balance: " + accounts.get("user1"));
    }
}

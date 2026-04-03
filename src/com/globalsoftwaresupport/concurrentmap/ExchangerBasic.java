package com.globalsoftwaresupport.concurrentmap;

import java.util.concurrent.Exchanger;

public class ExchangerBasic {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread t1 = new Thread(() -> {
            try {
                String data = "Data from thread 1";
                System.out.println("T1 Before exchange: "+data);
                data = exchanger.exchange(data);
                System.out.println("T1 After exchange: "+data);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                String data = "Data from thread 2";
                System.out.println("T2 Before exchange: "+data);
                data = exchanger.exchange(data);
                System.out.println("T2 After exchange: "+data);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t1.start();
        t2.start();
    }
}

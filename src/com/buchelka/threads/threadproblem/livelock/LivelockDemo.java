package com.buchelka.threads.threadproblem.livelock;

/*
* From ChatGpt example
* */

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class Employee implements Runnable {


    // Shared locks representing two shared resources.
    private final ReentrantLock accountLock;
    private final ReentrantLock ledgerLock;

    private final String name;

    private Random random = new Random();

    public Employee(String name, ReentrantLock accountLock, ReentrantLock ledgerLock) {
        this.name = name;
        this.accountLock = accountLock;
        this.ledgerLock = ledgerLock;
    }

    @Override
    public void run() {
        while (true) {
            // Try to acquire first lock.
            if(accountLock.tryLock()){
                try{
                    System.out.println(name +
                            " acquired Account Lock.");

                    // Give the other thread time to grab
                    // the second lock.
                    Thread.sleep(100);
                    // Try second lock.
                    if(ledgerLock.tryLock()){
                        try{
                            System.out.println(name +
                                    " acquired Ledger Lock.");

                            System.out.println(name +
                                    " completed transaction.");

                            break;
                        }finally {
                            ledgerLock.unlock();
                        }
                    }else {
                        System.out.println(name +
                                " couldn't get Ledger Lock.");

                        System.out.println(name +
                                " releases Account Lock to be polite.");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    accountLock.unlock();
                }
            }

            // Small pause before retrying.
            try {

                Thread.sleep(100);

            }
            catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            }
        }
    }

    /*
    @Override
    public void run() {
       while (true) {
           if (accountLock.tryLock()) {
              try{
                  if (ledgerLock.tryLock()) {
                      try{
                          System.out.println(name +
                                  " completed transaction.");
                          break;
                      }finally {
                          ledgerLock.unlock();
                      }

                  }
              }finally {
                  accountLock.unlock();
              }
           }
           try {
               Thread.sleep(random.nextInt(500));
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           }
       }
    }
    */
}



public class LivelockDemo {
    public static void main(String[] args) {


        ReentrantLock accountLock = new ReentrantLock();

        ReentrantLock ledgerLock = new ReentrantLock();

        Thread employee1 =
                new Thread(
                        new Employee(
                                "Employee-1",
                                accountLock,
                                ledgerLock));

        Thread employee2 =
                new Thread(
                        new Employee(
                                "Employee-2",
                                ledgerLock,
                                accountLock));

        employee1.start();

        employee2.start();

    }
}















































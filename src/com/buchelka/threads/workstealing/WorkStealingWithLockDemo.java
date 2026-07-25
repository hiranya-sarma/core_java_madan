package com.buchelka.threads.workstealing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkStealingWithLockDemo {

    // The Shared Object that multiple threads will interact with
    static class Inventory {
        private int itemsLeft = 100;

        // The Lock ensures only ONE thread can modify itemsLeft at a time
        //private final Object lock = new Object();
        private final Lock lock = new ReentrantLock();

        public boolean purchaseItem(String threadName, int orderId) {
            // LOG 1: Thread is arriving and wants the lock
            System.out.println("⏳ [" + threadName + "] Arrived. Waiting to acquire lock for Order #" + orderId);
            // Acquiring the lock. If another thread has it, this thread blocks!
            lock.lock();
            try {
                // LOG 2: Thread got the lock! Shows inventory state BEFORE modification
                System.out.println("🔒 [" + threadName + "] GOT LOCK for Order #" + orderId
                        + " | Inventory BEFORE: " + itemsLeft);
                if (itemsLeft > 0) {
                    // Simulate a tiny bit of business logic processing while holding the lock
                    Thread.sleep(50);
                    itemsLeft--;
                    return true;
                }
                return false;
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }finally {
                // LOG 4: Thread drops the lock so the next waiting thread can proceed
                System.out.println("🔓 [" + threadName + "] RELEASED LOCK for Order #" + orderId + "\n");
                lock.unlock();
            }

        }

        public int getItemsLeft() {
            return itemsLeft;
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newWorkStealingPool();
        Inventory sharedInventory = new Inventory();

        List<Callable<String>> tasks = new ArrayList<>();

        // Create 10 concurrent order processing tasks
        for(int i=1; i<=10; i++) {
            final int orderId = i;
            tasks.add(()->{
                String threadName = Thread.currentThread().getName();

                // Threads will execute this independently up to this point...
                System.out.println("[" + threadName + "] Attempting to process Order #" + orderId);

                // ...but they will hit a bottleneck right here inside purchaseItem()
                boolean success = sharedInventory.purchaseItem(threadName, orderId);

                return "Order #" + orderId + " processed by " + threadName + ". Success: " + success;
            });
        }

        try{
            System.out.println("=== STARTING BATCH ORDER PROCESSING ===\n");

            // Submit all tasks simultaneously
            List<Future<String>> results = executor.invokeAll(tasks);
            System.out.println("=== ALL ORDERS PROCESSED ===");
            System.out.println("Final Remaining Inventory: " + sharedInventory.getItemsLeft() + " / 100\n");
//            System.out.println("\n--- Processing Complete ---");
//            for(Future<String> result : results){
//                System.out.println(result.get());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }

    }

}














































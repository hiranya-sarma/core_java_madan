package com.globalsoftwaresupport.blockingqueue;

import java.util.concurrent.DelayQueue;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException{
        DelayQueue<DelayedTask> queue = new DelayQueue<>();

        queue.put(new DelayedTask("Task1", 3000));
        queue.put(new DelayedTask("Task2", 1000));
        queue.put(new DelayedTask("Task3", 5000));

        while(!queue.isEmpty()){
            DelayedTask task = queue.take(); // blocks until ready
            System.out.println("Executed: "+" "+task.getName()+" at "+System.currentTimeMillis());

        }

    }
}

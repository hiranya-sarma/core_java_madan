package com.eazybytes.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(5);
        queue.offer(20);
        queue.offer(15);
        queue.offer(30);
        queue.offer(25);

        System.out.println("Priority Queue: " + queue);
        while(!queue.isEmpty()){
            System.out.println("Dequeued: "+queue.poll());
        }
    }
}

package com.eazybytes.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        //Program against the interface, instantiate the concrete class

        Deque<String> deque = new ArrayDeque<>();

        System.out.println("=== 1. USING AS A STANDARD QUEUE (FIFO) ===");
        // Add to tail, remove from head

        deque.offerLast("Alice"); // Recommended: returns false if full (though ArrayDeque is unbounded)
        deque.addLast("Bob");   // Throws exception if full
        deque.offerLast("Charlie");
        deque.addLast("Dave");
        deque.addFirst("Eve");
        deque.offerFirst("Frank");

        System.out.println("Queue State: " + deque); // [Alice, Bob, Charlie]
        System.out.println("Peek from front: " + deque.peekFirst());

        System.out.println("Polled from front: " + deque.pollFirst());
        System.out.println("Queue State: " + deque);
        System.out.println("Polled " + deque.poll());
        System.out.println("Queue State: " + deque);

        System.out.println("\n=== 2. USING AS A STACK (LIFO) ===");
        // Clear out and repurpose
        deque.clear();
        deque.push("Plate 1"); // Equivalent to addFirst()
        deque.push("Plate 2");
        deque.push("Plate 3");
//        System.out.println("Stack State: " + deque);
//        System.out.println("Popped from stack: " + deque.pop());
        System.out.println("Stack State: " + deque);
        System.out.println("Top of stack: " + deque.peek());
        System.out.println("Top of stack2: " + deque.element());
        System.out.println("Top of stack3: " + deque.peekLast());
        System.out.println("Popped from stack: " + deque.pop());
        System.out.println("Stack State: " + deque);

        System.out.println("\n=== 3. DOUBLE-ENDED MANIPULATION & ITERATION ===");
        deque.clear();
        deque.addLast("Middle");
        deque.addFirst("Front");
        deque.addLast("Back");
        //deque.addFirst(null);
        System.out.println("Stack State: " + deque);

        // Standard Forward Iteration
        System.out.print("Forward Iteration: ");
        for(String item: deque){
            System.out.print(item + " -> ");
        }
        System.out.println("END");

        // Reverse Iteration (Unique to Deque)
        System.out.print("Reverse Iteration: \n");
        Iterator<String> reverseIterator = deque.descendingIterator();
        while(reverseIterator.hasNext()){
            System.out.println(reverseIterator.next() + " <- ");
        }
        System.out.println("START");


    }
}

























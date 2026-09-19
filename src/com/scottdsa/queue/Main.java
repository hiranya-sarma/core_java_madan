package com.scottdsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(4);
        myQueue.enqueue(5);
      //  myQueue.dequeue();
       // myQueue.printAll();
        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());


        /*
            EXPECTED OUTPUT:
            ----------------
            First: 4
            Last: 4
            Length: 1

            Queue:
            4

        */
    }
}

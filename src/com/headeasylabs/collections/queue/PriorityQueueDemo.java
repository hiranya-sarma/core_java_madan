package com.headeasylabs.collections.queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //creating priorityQueue
      PriorityQueue pq = new PriorityQueue();
        //defaul size = 11
        //DNSO - default natural sorting order
        //PriorityQueue does not allow null

        // Queue interface can support insertion order, null elements, and
        // duplicate elements, but the actual behavior depends on its implementation.

        //creating priorityQueue with specified size
        PriorityQueue pq1 = new PriorityQueue(20);

        //creating priorityQueue with initial capacity and comparator object
        //PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);

        SortedSet s = new TreeSet();
        //creating priorityQueue equivalent to sortedSet s
        PriorityQueue pq3 = new PriorityQueue(s);

        List l = new ArrayList();
        //creating equivalent priorityQueue for any collection
        PriorityQueue pq4 = new PriorityQueue(l);

        PriorityQueue<String> pq5 = new PriorityQueue<>();

        pq5.add("Charlie");
        pq5.add("Alice");
        pq5.add("Bob");
        //pq5.add("Bob"); //[Alice, Bob, Bob, Charlie]

        //You might see something like:
        //[Alice, Charlie, Bob]
        System.out.println(pq5);
        /*
        Don't assume the entire internal structure is sorted.

        The guarantee is:
        The highest-priority element is available at the head.

        For natural ordering, that's the smallest element.

        Use:
         */
        while (!pq5.isEmpty()) {
            System.out.println(pq5.poll());
        }

        //What About Uppercase and Lowercase?
        //This is where beginners often get surprised.
        /*
        You might expect:
        apple
        Banana
        cat

        But that's not how Java's natural String ordering works.

      Java compares the underlying characters according to their Unicode values.
      For example:
      'B' = 66
      'a' = 97
      'c' = 99

        can produce:
        Banana
        apple
        cat
         */
        PriorityQueue<String> pq6 = new PriorityQueue<>();

        pq6.add("apple");
        pq6.add("Banana");
        pq6.add("cat");
        while (!pq6.isEmpty()) {
            System.out.println(pq6.poll());
        }





    }
}

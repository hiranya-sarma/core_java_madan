package com.buchelka.section10;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");

        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        removeElements(placesToVisit);

        System.out.println("--".repeat(10));

        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Sydney");
        queue.offer("Canberra");
        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println(queue.poll());
        System.out.println("Peek: "+queue.peek());

        System.out.println("--------- Dequeue "+"-".repeat(10));
        LinkedList<String> dequeue = new LinkedList<>();
        dequeue.push("Sydney");
        dequeue.push("Canberra");
        dequeue.push("Melbourne");
        dequeue.push("Brisbane");
        dequeue.push("Adelaide");
        dequeue.push("Perth");
        dequeue.push("Darwin");
        System.out.println(dequeue);
        System.out.println("--------- Iterator "+"-".repeat(10));
        ListIterator<String> it = dequeue.listIterator();
        while(it.hasNext()){
            if(it.next().equals("Darwin")){
                it.remove();
            }
           // System.out.println(it.next());
        }
        System.out.println(dequeue);


    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //stack methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1 + " was removed");
    }
}

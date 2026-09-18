package com.scottdsa.linledlistdemo;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);


        myLinkedList.prepend(10);
        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
        myLinkedList.printAll();

//        System.out.println("Removed last: "+myLinkedList.removeLast().value);
//        System.out.println("Removed last: "+myLinkedList.removeLast().value);
//        System.out.println("Removed last: "+myLinkedList.removeLast().value);
//        System.out.println("Removed last: "+myLinkedList.removeLast().value);
       // System.out.println("Removed first: "+myLinkedList.removeFirst().value);
        //myLinkedList.printAll();

        //get the middle element
        System.out.println("get 2nd element: "+myLinkedList.get(1).value);
        System.out.println("get 1st element: "+myLinkedList.get(0).value);
        System.out.println("-----------------------------------------------------");
        //set
      //  myLinkedList.set(1, 100);
        myLinkedList.reverse();
        myLinkedList.printAll();
    }
}

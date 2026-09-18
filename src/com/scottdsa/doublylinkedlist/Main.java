package com.scottdsa.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);

        dll.append(2);
        dll.prepend(3);

        // (2) Items - Returns 2 Node
       // System.out.println(dll.removeLast().value);
        // (1) Item - Returns 1 Node
       // System.out.println(dll.removeLast().value);
        // (0) Items - Returns null
       // System.out.println(dll.removeLast());

        // (2) Items - Returns 2 Node
        System.out.println(dll.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(dll.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(dll.removeFirst().value);

      //  System.out.println(dll.removeFirst().value); // Null pointer ex
        System.out.println("-----------------------------------------------");
        //dll.printList();
        dll.printAll();
    }
}

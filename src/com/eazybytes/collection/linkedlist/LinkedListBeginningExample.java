package com.eazybytes.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListBeginningExample {
    public static void main(String[] args) {
        LinkedList<String> notifications = new LinkedList<>();
        // New notifications arrive
        notifications.addFirst("Email from HR");
        notifications.addFirst("Meeting at 2 PM");
        notifications.addFirst("Server Down");
        notifications.addFirst("Salary Credited");

        System.out.println("Initial notifications:");
        print(notifications);

        // Remove the latest notification
        String removed = notifications.removeFirst();
        System.out.println("\nRemoved: " + removed);

        System.out.println("\nAfter removing first:");
        print(notifications);

        // Another notification arrives
        notifications.addFirst("Laptop Delivered");

        System.out.println("\nAfter adding another notification:");
        print(notifications);
    }
    private static void print(LinkedList<String> list){
        for(String notification : list){
            System.out.println(notification);
        }
    }

}

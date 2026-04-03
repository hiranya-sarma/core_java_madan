package com.globalsoftwaresupport.concurrentmap;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListBasic {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        System.out.println(list);
        for(String item: list){
            System.out.println(item);
            list.add("ItemX");
        }
        System.out.println("Final list: "+list);
    }
}

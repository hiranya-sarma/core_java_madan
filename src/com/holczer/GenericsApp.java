package com.holczer;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {

    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>(t);
        list.add(bucket);
        System.out.println("Added "+t.toString()+" to the list");


    }

    public static void main(String[] args) {
        System.out.println("Hello World!");


        List<Integer> nums = new ArrayList<>();
        List<Bucket<Integer>> list = new ArrayList<>();
        GenericsApp.addStore(10, list);


        Store<Double> store = new Store<>();
        store.setItem(30.4);
        Double item = store.getItem();
        System.out.println("This is the item: "+item);
        System.out.println(store.show(item));



    }
}

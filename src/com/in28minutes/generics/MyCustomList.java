package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T item) {
        list.add(item);
    }
    public void removeElement(T item) {
        list.remove(item);
    }

    public String toString() {
        return list.toString();
    }

    public T get(int index) {
        return list.get(index);
    }
}

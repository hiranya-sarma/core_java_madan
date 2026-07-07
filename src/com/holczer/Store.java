package com.holczer;

public class Store<T> {
    public T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public <T> T  show(T item) {
        System.out.println("This is item inside method print: "+item.toString());
        return item;
    }
}

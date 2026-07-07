package com.holczer;

public class Bucket<T> {

    T item;

    public Bucket(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

}

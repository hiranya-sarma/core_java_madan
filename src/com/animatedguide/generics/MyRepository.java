package com.animatedguide.generics;

public class MyRepository<T> implements Repository<T> {

    @Override
    public void save(T item) {
        System.out.println("saving " + item);
    }

    @Override
    public T find() {
        return null;
    }
}

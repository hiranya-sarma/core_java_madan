package com.designpatterns.chadderby.behavioral.iterator;

public interface PatternIterator<T> {
    boolean hasNext();
    T next();
}

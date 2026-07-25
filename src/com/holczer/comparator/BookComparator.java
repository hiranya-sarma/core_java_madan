package com.holczer.comparator;


import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getNumberOfPages(), b2.getNumberOfPages());
    }
}

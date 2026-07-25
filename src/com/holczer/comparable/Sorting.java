package com.holczer.comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Author Name1", "Book Title1", 100));
        books.add(new Book("Z", "Book TitleZ", 100));
        books.add(new Book("Author Name2", "Book Title2", 200));
        books.add(new Book("BAuthor Name3", "Book Title3", 300));


        Collections.sort(books);
        System.out.println(books);
    }
}

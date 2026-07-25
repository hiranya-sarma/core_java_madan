package com.holczer.comparator;

public class Book implements Comparable<Book>{

    private String authorName;
    private String title;
    private int numberOfPages;

    public Book(){

    }

    public Book(String authorName, String title, int numberOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int compareTo(Book otherBook) {
        //  return this.authorName.compareTo(otherBook.authorName);

//        if (this.numberOfPages > otherBook.getNumberOfPages()) return -1;
//        if (this.numberOfPages == otherBook.getNumberOfPages()) return 0;
//        else return +1;
        // Swapping the typical order (other vs this) achieves descending order cleanly
        return Integer.compare(otherBook.getNumberOfPages(), this.numberOfPages);
    }
}











































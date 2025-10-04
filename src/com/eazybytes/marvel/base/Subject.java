package com.eazybytes.marvel.base;

public abstract class Subject {

    public static final int minimumMarks = 0;

    public int TotalMarks(){
        return 100;
    }

    public abstract void teach();

    public int getMinimumMarks(){
        return minimumMarks;
    }
}

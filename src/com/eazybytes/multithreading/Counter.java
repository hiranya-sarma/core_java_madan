package com.eazybytes.multithreading;

public class Counter {
    int count = 0;

    synchronized void increment(){
        count++;
    }
}

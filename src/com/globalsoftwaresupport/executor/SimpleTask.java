package com.globalsoftwaresupport.executor;

public class SimpleTask implements Runnable{
    private int id;

    public SimpleTask(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}


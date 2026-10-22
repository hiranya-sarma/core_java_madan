package com.designpatterns.mypractice.structural.proxy;

public class RealDocument implements Document {

    private final String filename;

    public RealDocument(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + filename);
    }
}

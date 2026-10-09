package com.animatedguide.generics;

public class ColoredBox<X, C> extends Box<X> {

    private C color;

    public ColoredBox(X value, C color) {
        super(value);
        this.color = color;
    }
    public void display(){
        System.out.println("Value: "+getValue()+", Color: "+color);
    }
}

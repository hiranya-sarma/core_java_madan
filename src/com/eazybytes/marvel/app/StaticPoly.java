package com.eazybytes.marvel.app;

import com.eazybytes.marvel.heroes.IronMan;

public class StaticPoly {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("Ice Cream", 2,10);
        ironMan.eat("Ice Cream", -2,true);
    }
}

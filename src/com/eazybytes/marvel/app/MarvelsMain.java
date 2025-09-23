package com.eazybytes.marvel.app;

import com.eazybytes.marvel.heroes.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {

        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.walk();
        ironMan.sleep();
        ironMan.usePower();
    }
}

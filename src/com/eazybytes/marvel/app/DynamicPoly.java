package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Person;
import com.eazybytes.marvel.heroes.IronMan;

public class DynamicPoly {
    public static void main(String[] args) {
         Person person = new IronMan(); //Upcasting
         person.walk();
         person.eat("Ice Cream");

         IronMan ironMan = new IronMan();
         ironMan.callOveriddenMEatethod();
    }
}

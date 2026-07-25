package com.holczer.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //Lambda Expression
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rahul", 29));
        people.add(new Person("Ramesh", 25));
        people.add(new Person("Rahul", 26));
        people.add(new Person("Raja", 22));
        people.add(new Person("Ramesh", 21));

        Collections.sort(people, Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for(Person person: people){
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}

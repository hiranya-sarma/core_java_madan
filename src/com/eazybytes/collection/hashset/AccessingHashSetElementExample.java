package com.eazybytes.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class AccessingHashSetElementExample {
    public static void main(String[] args) {

        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println(daysOfWeek);

        boolean isMonday = daysOfWeek.contains("Monday");
        //System.out.println(isMonday);
        if(isMonday){
            System.out.println("Monday is present in the set");
        }else {
            System.out.println("Monday is not present in the set");
        }

        int sizeOfWeek = daysOfWeek.size();
        System.out.println("HashSet size: "+sizeOfWeek);

        if(daysOfWeek.isEmpty()){
            System.out.println("HashSet is empty");
        }else {
            System.out.println("HashSet is not empty");
        }
    }
}

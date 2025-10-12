package com.eazybytes.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<String> countryNames = new ArrayList<String>();
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();

        System.out.println(countryNames.size());
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        System.out.println(countryNames);
        countryNames.add(1,"France");
        countryNames.set(4, "Spain");
        countryNames.remove("India");
        String firstElement = countryNames.get(0);
        String firstElement2 = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        System.out.println("First elem: "+firstElement);
        System.out.println("First elem2:"+firstElement2);
        System.out.println("Last elem: "+lastElement);
        List<String> reversed = countryNames.reversed();
        System.out.println(countryNames);
        System.out.println(reversed);

        Iterator<String> itr = countryNames.iterator();
        while(itr.hasNext()){
            String country = itr.next();
            System.out.println("Iterator: "+country);
            //countryNames.remove("India"); //Runtime Exception
            if( country.equals("India")){
                itr.remove();
            }

        }

        ListIterator<String> listIterator = countryNames.listIterator();

        while(listIterator.hasNext()){
            String country = listIterator.next();
            System.out.println("List Iterator: "+country);
        }

        while(listIterator.hasPrevious()){
            String country = listIterator.previous();
            System.out.println("List Iterator previous: "+country);
        }






    }
}

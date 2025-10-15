package com.eazybytes.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardDemo {
    public static void main(String[] args) {
       addMumbers(List.of(1,2,3,4,5));
      // addMumbers(new ArrayList<Double>());
    }
    public static void addMumbers(List<? super Integer> list) {
         for(int i=0; i<10; i++) {
             list.add(i);
         }
        System.out.println(list);
    }
}

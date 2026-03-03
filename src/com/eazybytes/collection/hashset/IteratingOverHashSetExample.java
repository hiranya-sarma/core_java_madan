package com.eazybytes.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingOverHashSetExample {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Pearl");

        //1. Below not working
        //❌ Does NOT maintain order
        //❌ Does NOT support indexing
        //❌ Does NOT have a get(int index) method
        for(int i=0; i<programmingLanguages.size(); i++){
         //   System.out.println(programmingLanguages.get(i));
        }
        //2.
        for(String language: programmingLanguages){
           // System.out.println(language);
        }
        //3.
       // programmingLanguages.forEach(System.out::println);

        //4. Iterator
//        Iterator<String> iteratorList= programmingLanguages.iterator();
//        while(iteratorList.hasNext()){
//            System.out.println(iteratorList.next());
//        }
        //5.
        Iterator<String> iteratorList2= programmingLanguages.iterator();
      //  iteratorList2.forEachRemaining(System.out::println);

    }
}

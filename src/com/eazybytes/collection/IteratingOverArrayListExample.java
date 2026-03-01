package com.eazybytes.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Pearl");

        //1.
        for(int i=0; i<programmingLanguages.size(); i++){
          //  System.out.println(programmingLanguages.get(i));
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
        iteratorList2.forEachRemaining(System.out::println);

    }
}

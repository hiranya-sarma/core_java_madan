package com.animatedguide.generics;

import com.animatedguide.generics.enumdemo.Color;
import com.animatedguide.generics.enumdemo.EnumWrapper;
import com.animatedguide.generics.keyvalue.KeyValue;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //public void print(T value){}
    public static void main(String[] args) {

        KeyValue<Integer, String> keyValue = new KeyValue<>(1, "One");
        System.out.println(keyValue.getKey());
        System.out.println(keyValue.getValue());

        EnumWrapper<Color> wrapper = new EnumWrapper<>(Color.RED);
        System.out.println(wrapper.getEnumValue());

        System.out.println(wrapper.getEnumValue().name());
        System.out.println(wrapper.getEnumValue().ordinal());

        MyRepository<String> repo = new MyRepository<>();
        repo.save("John");
        String name = repo.find();
        System.out.println(name);

        Dog<String> myDog = new Dog<>("Snoop");
        myDog.makeSound();
        myDog.display();

        ColoredBox<Integer, String> coloredBox = new ColoredBox<>(100, "Blue");
        coloredBox.display();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        for(Integer i : arrayList){
            System.out.println(i);
        }

        List rawList = arrayList;
        rawList.add(1);
        rawList.add("jon");
    }
}

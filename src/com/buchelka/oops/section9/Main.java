package com.buchelka.oops.section9;


import java.util.Arrays;
import java.util.Random;

class MyClass{
    public MyClass(){
        System.out.println("MyClass constructor");
    }
}

public class Main {
    public static void main(String[] args) {

        int[] myIntsArr = new int[5];
        for(int i = 0; i<myIntsArr.length;i++){
            myIntsArr[i] = myIntsArr.length - i;
        }
        System.out.println(Arrays.toString(myIntsArr));

        System.out.println("-----------------------");

        String[] myStringsArr = new String[5];

        for(int i = 0; i<myStringsArr.length;i++){
            System.out.println(myStringsArr[i]);
        }
        System.out.println("------------------------------------------------");

        MyClass[] myClassArr = new MyClass[]{ new MyClass(), new MyClass()};

        for(int i = 0; i<myClassArr.length;i++){
            myClassArr[i] = new MyClass();
        }
        System.out.println("MyClass arr Done");
        System.out.println(myClassArr[0]);
        System.out.println("------------------------------------------------");

        int[] firstArray = getRandomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

       // Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(thirdArray == fourthArray);
        System.out.println(Arrays.equals(thirdArray, fourthArray));
        System.out.println("------------------------------------------------");
        String[] names = {"John", "Jane", "Bob", "Alice"};
        String[] names1 = names;
        System.out.println("names == names1 : " + (names == names1));
        names1[0] = "Jane1";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names1));
        System.out.println("names == names1 : " + (names == names1));
        Arrays.sort(names);
        System.out.println(Arrays.binarySearch(names, "Jane1"));

        System.out.println("------------------------------------------------");
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i<len;i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}




























































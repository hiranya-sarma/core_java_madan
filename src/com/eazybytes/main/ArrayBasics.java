package com.eazybytes.main;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {
        int[] mobileNumbers = new int[5];
        mobileNumbers[0] = 766554433;
        mobileNumbers[1] = 987654321;
        mobileNumbers[2] = 123456789;
        mobileNumbers[3] = 111111111;
        mobileNumbers[4] = 222222222;

        int[] nums = {1,2,3,4,5};
        for(int num : nums){
            System.out.println("Number::"+num);
        }

        for (int i = 0; i < mobileNumbers.length; i++) {
            System.out.println(mobileNumbers[i]);
        }

//        String[] names = {"John", "Mary", "Robert"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        String[] countries = {"India", "USA", "Brazil", "China"};
        String[] temp = new String[countries.length];
        for (String country : countries){
           // System.out.println(country.toLowerCase());
        }
        for(int i = 0; i < countries.length; i++){
          //  System.out.println(countries[i].toLowerCase());
            temp[i] = countries[i].toUpperCase();
        }
        System.out.println(Arrays.toString(temp));

        int[] oldArray = {1,2,3,4,5};
      //  int[] newArray = Arrays.copyOf(oldArray, 30);
        //System.out.println(Arrays.toString(newArray));
        int[] newArray1 = new int[oldArray.length+5];
        newArray1 = copyOldToNewAray(oldArray, newArray1);
        System.out.println(Arrays.toString(newArray1));

        int[] newArray2 = new int[oldArray.length+5];
      //  System.arraycopy(oldArray, 0, newArray2, 5, oldArray.length);
        System.arraycopy(oldArray, 0, newArray2, 0, oldArray.length);
        System.out.println(Arrays.toString(newArray2));

        int[] copy = Arrays.copyOfRange(oldArray, 0, oldArray.length+5);
        System.out.println(Arrays.toString(copy));

        int[] numbers2 = {9, 3, 7, 1, 6, 2, 8, 4, 5};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = {9, 3, 7, 1, 6, 2, 8, 4, 5};
        Arrays.parallelSort(numbers3, 0, numbers3.length);
        System.out.println("---------------------parallel sort----------------------------");
        System.out.println(Arrays.toString(numbers3));
        System.out.println("--------------------------------------------------------------");
        int[] numbers4 = {9, 3, 7, 1, 6, 2, 8, 4, 5};
        Arrays.sort(numbers4, 5, 9);
        System.out.println(Arrays.toString(numbers4));
        System.out.println("-----------------------binarySearch---------------------------");
        int[] numbers5 = {9, 3, 7, 1, 6, 2, 8, 4, 5};
        Arrays.sort(numbers5);
        System.out.println(Arrays.binarySearch(numbers5, 333));
        System.out.println("--------------------------------------------------------------");

    }
    private static int[] copyOldToNewAray(int[] oldArray, int[] newArray){
     for(int i = 0; i < oldArray.length; i++){
         newArray[i] = oldArray[i];
     }
     return newArray;
    }

}

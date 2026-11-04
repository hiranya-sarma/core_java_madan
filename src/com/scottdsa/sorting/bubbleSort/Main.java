package com.scottdsa.sorting.bubbleSort;

import java.util.Arrays;

public class Main {

    static void bubbleSort(int[] array){
        for (int i=array.length-1; i>0; i--){
            System.out.println("i = "+i);
            for (int j=0; j<i; j++){
                System.out.println("j = "+j);
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println("----------------");
        }
    }
    public static void main(String[] args) {

        int[] myArray = {4,2,6,77,5,1,3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));

    }
}

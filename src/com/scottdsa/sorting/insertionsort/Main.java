package com.scottdsa.sorting.insertionsort;

import java.util.Arrays;

public class Main {

    static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            // to make it descending, do "arr[j]<temp"
            while (j>=0&&arr[j]>temp){
               arr[j+1]=arr[j];
               arr[j]=temp;
               j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4,2,6,62,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }
}

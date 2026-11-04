package com.scottdsa.sorting.insertionsort;

import java.util.Arrays;

public class Main {

    static void insertionSort(int[] arr){
        // Outer loop: Iterate through all elements in the array, starting from the second element
        for (int i=1; i<arr.length; i++){
            // Store the first element in the unsorted part of the array in a temporary variable
            int temp=arr[i];
            // Initialize j to store the index of the last element in the sorted part of the array
            int j=i-1;
            // Inner loop: Check whether the temporary value should be inserted in the sorted part
            // to make it descending, do "arr[j]<temp"
            while (j>=0&&arr[j]>temp){
                // Shift the element at index j one position to the right in the sorted part
               arr[j+1]=arr[j];
                // Assign the temporary value to the element at the index j
               arr[j]=temp;
                // Decrement j to move towards the beginning of the sorted part of the array
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

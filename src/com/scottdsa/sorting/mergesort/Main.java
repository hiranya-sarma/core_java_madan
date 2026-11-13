package com.scottdsa.sorting.mergesort;

import java.util.Arrays;

public class Main {
   // Also call Divide and Conquer
    private static int[] merge(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                combined[index++] = left[i++];
            }else  {
                combined[index++] = right[j++];
            }
        }
        while (i < left.length) {
            combined[index++] = left[i++];
        }
        while (j < right.length) {
            combined[index++] = right[j++];
        }

        return combined;
    }

    static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        int[] mergedArr = merge(left, right);
        return mergedArr;
    }

    public static void main(String[] args) {
//        int[] array1 = {1,3,7,8};
//        int[] array2 = {2,4,5,6};
//
//        System.out.println( Arrays.toString( merge(array1, array2) ) );
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

        int[] originalArray = {3,1,7,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "Original Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */

    }
}

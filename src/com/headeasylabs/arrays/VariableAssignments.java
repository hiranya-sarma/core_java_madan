package com.headeasylabs.arrays;

import java.util.Arrays;
import java.util.List;

public class VariableAssignments {
    public static void main(String[] args) {
        int[] x = new int[2];
        int[] a = x;
        x[0] = 1;
        System.out.println(x[0]);
        System.out.println(a[0]);
        a[1] = 2;
        System.out.println(x[1]);
        System.out.println(a[1]);

        short[] shorts = new short[2];  //[S
        //int[] ints = shorts;            //[I

        /*Below
        This does not produce a List<Integer>.
        Instead, it produces a List<int[]> containing a single element: the entire primitive array.
        Why?
        Because Java generics work with reference types, not primitive types. The primitive array int[] is itself an object,
        so the compiler treats it as one varargs argument.
         */
        //List<Integer> list = Arrays.asList(new int[]{2,5,8,9});
        List<int[]> list = Arrays.asList(new int[]{2,5,8,9});

        //You can simplify it to:
        List<Integer> list100 = Arrays.asList(2, 5, 8, 9);
        /*
        Why does above list100 work?
        Because Arrays.asList() is a varargs method:
        public static <T> List<T> asList(T... a)
        The T... parameter allows you to pass multiple arguments, which Java treats as an array.
         */

        //These are all valid:
        // 1. Passing individual arguments
        List<Integer> list1 = Arrays.asList(2, 5, 8, 9);

        // 2. Passing an explicitly created array
        List<Integer> list2 =
                Arrays.asList(new Integer[]{2, 5, 8, 9});

        // 3. Passing an existing array
        Integer[] numbers = {2, 5, 8, 9};
        List<Integer> list3 = Arrays.asList(numbers);

    }
}





























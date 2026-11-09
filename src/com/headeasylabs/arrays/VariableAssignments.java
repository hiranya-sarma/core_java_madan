package com.headeasylabs.arrays;

import java.util.ArrayList;
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

        /*
        List<? super Integer> list1 = new ArrayList<Integer>();  // Valid
        List<? super Integer> list2 = new ArrayList<Number>();   // Valid
        List<? super Integer> list3 = new ArrayList<Object>();   // Valid
         */
        List<? super Integer> list4 = new ArrayList<Number>();
        /*
        This is valid because Integer extends Number, and Java performs autoboxing:
        Number n = Integer.valueOf(12);

        Compile-time error
        list4.add(n);
        Because n is declared as Number, not Integer.

        The compiler only guarantees that the list can accept Integer values or their subtypes.
        It cannot guarantee that an arbitrary Number is an Integer.
        For example, Number could refer to a Double, Float, or Long.
         */
        Number n=12;
        Integer i=67;
       // list4.add(n);
        list4.add(i);

        List<Integer> p = new ArrayList<>();
        List q = p;

    }
}





























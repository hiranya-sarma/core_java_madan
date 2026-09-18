package com.buchelka.oops.section9;

import java.util.Arrays;

public class MultipleArrays {

    public static void main(String[] args) {
       int[][] array2 = new int[2][4];




       for (int i = 0; i < array2.length; i++) {
           for (int j = 0; j < array2[i].length; j++) {
               array2[i][j] = i * j;
           }
       }

       //array2[1] = {1,2,3,4};
        array2[1] = new int[]{1,2,3,4};

       System.out.println(Arrays.deepToString(array2));

//       for (int i = 0; i < array2.length; i++) {
//           for (int j = 0; j < array2[i].length; j++) {
//               System.out.print(array2[i][j] + " ");
//           }
//           System.out.println();
//       }
    }
}

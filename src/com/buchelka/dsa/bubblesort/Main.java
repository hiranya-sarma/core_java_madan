package com.buchelka.dsa.bubblesort;

public class Main {
    public static void main(String[] args) {

//        int[] intArray = new int[7];
//
//        intArray[0] = 20;
//        intArray[1] = 35;
//        intArray[2] = -15;
//        intArray[3] = 7;
//        intArray[4] = 55;
//        intArray[5] = 1;
//        intArray[6] = -22;
//
//        int index = -1;
//
//        for(int i = 0; i < intArray.length; i++){
//            if(intArray[i] == 7){
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println("index = "+index);

        int[] intArray = {20,35,-15,7,55,1,-22};
        for(int lastSortedIndex = intArray.length-1; lastSortedIndex > 0; lastSortedIndex--){
          //  System.out.println("lastSortedIndex = "+lastSortedIndex);

            for(int i = 0; i<lastSortedIndex; i++){
                System.out.println("i = "+intArray[i]+" "+intArray[i+1]);
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }


        }

//        for(int i = 0; i<intArray.length; i++){
//            System.out.print(intArray[i]+" ");
//        }


    }
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

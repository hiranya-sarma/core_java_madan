package com.buchelka.dsa.selectionsort;

public class Main {
    public static void main(String[] args) {


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for(int i = 0; i<intArray.length;i++ ){

            for(int j=i+1; j<intArray.length;j++){

                if(intArray[i] > intArray[j]){

                    int temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;


                }
            }

        }
        for(int i = 0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
    }

}

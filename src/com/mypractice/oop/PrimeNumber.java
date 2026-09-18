package com.mypractice.oop;

public class PrimeNumber {

    public static void main(String[] args) {

       int N = 100;

        for(int i = 0; i<=N; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            //System.out.println(number + " is prime? " + isPrime(number));
        }

    }

    //function to check if a given number is prime
    static boolean isPrime(int number){
        //since 0 and 1 is not prime return false.

        if(number == 1 || number == 0) return false;

        for(int i = 2; i<number; i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}

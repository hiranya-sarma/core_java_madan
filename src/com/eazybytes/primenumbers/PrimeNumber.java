package com.eazybytes.primenumbers;


public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public  static void main(String[] args){
        int n = 29;
        System.out.println("Is number "+n+" prime? "+isPrime(n));
    }
}

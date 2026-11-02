package com.scottdsa.binarysearchtree;

public class LoopTest {

    static boolean test1(){
        while (true) {
            System.out.println("While loop test1");
            //return; //prints only once
            //return true; //prints only once
           // return false;  //prints only once
            if (true) break;
            //return true; //fatal error here if we use break
        }
        return true;
    }

    public static void main(String[] args) {
      var val = test1();
        System.out.println(val);
    }
}

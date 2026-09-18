package com.mypractice.singleton;

public class MySingleton {

//      private static MySingleton instance;
//
//      private MySingleton(){
//          System.out.println("Instance created");
//      }
//
//      public static MySingleton getInstance(){
//          if(instance == null){
//              instance = new MySingleton();
//
//          }
//          return instance;
//      }

    private static final MySingleton instance = new MySingleton();

    private MySingleton(){
        System.out.println("Instance created");
    }

    public static MySingleton getInstance(){
        return instance;
    }
}

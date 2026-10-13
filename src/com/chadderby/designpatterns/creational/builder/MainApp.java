package com.chadderby.designpatterns.creational.builder;

public class MainApp {
    public static void main(String[] args) {

        //Create Meal with required burger and optional drink
        Meal meal1 = new Meal.Builder(Burger.VEG)
                .drink(Drink.COKE)
                .build();
        System.out.println(meal1);

        //Create Meal with required burger and optional drink,fries
        Meal meal2 = new Meal.Builder(Burger.CHEESE_BURGER)
                .drink(Drink.LEMONADE)
                .fries(Fries.FRENCH_FRIES)
                .build();
        System.out.println(meal2);

    }
}

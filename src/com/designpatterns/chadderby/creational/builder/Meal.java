package com.designpatterns.chadderby.creational.builder;

import java.util.Objects;

public class Meal{

    // "mvn clean compile" to check if any errors only after "Rebuild Project" option in IDE does not work
    //Required
    private final Burger burger;

    // Optional
    private final Fries fries;
    private final Drink drink;

    //private meal constructor used only by the Builder
    private Meal(Builder builder){
       this.burger = builder.burger;
       this.fries = builder.fries;
       this.drink = builder.drink;
    }

    //static inner builder for meal objects
    public static class Builder{
        //Required
        private final Burger burger;

        // optional
        private Fries fries;
        private Drink drink;

        //Builder constructor for required fields
        public Builder(Burger burger){
            this.burger = Objects.requireNonNull(burger, "burger must not be null");
        }
        //setter for optional drink
        public Builder drink(Drink drink){
            this.drink = drink;
            return this;
        }

        //setter for optional fries
        public Builder fries(Fries fries){
            this.fries = fries;
            return this;
        }
        // returns the Meal instance
        public Meal build(){
            return new Meal(this);
        }
    }
    // Returns a string representation of a Meal
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", fries=" + displayValue(fries) +
                ", drink=" + displayValue(drink) +
                '}';
    }

    private String displayValue(Object value){
        return Objects.toString(value, "None");
    }

    //Getters to access values set via the builder
    public Burger getBurger() {
        return burger;
    }

    public Fries getFries() {
        return fries;
    }

    public Drink getDrink() {
        return drink;
    }
}





































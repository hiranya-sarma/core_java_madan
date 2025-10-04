package com.eazybytes.marvel.heroes;

import com.eazybytes.marvel.base.Person;
import java.io.IOException;

public class IronMan extends Person {

    public void usePower () {
        System.out.println("Iron Man is using power");
    }

    @Override
    public void walk () {
        System.out.println("Iron Man is walking with his suite");
    }

    @Override
    public void eat(String food) {
        super.eat("Pasta1");
        System.out.println("Iron Man is eating the food : " + food);
    }

    public void callOveriddenMEatethod() {
        super.eat("Pasta2");
    }

    // Keep all overloads under the same base name: eat()

    // No-arg overload - uses a default food
    public void eat() {
        super.eat("Default Pasta");
        System.out.println("Iron Man is eating by default (no-arg)");
    }

    // Overload with quantity
    public void eat(String food, int quantity) {
        super.eat(food);
        System.out.println("Iron Man is eating " + quantity + " servings of: " + food);
    }

    // Overload with calories (different signature)
    public void eat(int calories) {
        System.out.println("Iron Man is eating something worth " + calories + " calories");
    }

    // Varargs overload to accept multiple foods
    public void eat(String... foods) {
        if (foods == null || foods.length == 0) {
            eat(); // delegate to no-arg
            return;
        }
        for (String f : foods) {
            super.eat(f);
            System.out.println("Iron Man sampled: " + f);
        }
    }

    // Overload that returns boolean (differs by parameters)
    public boolean eat(String food, boolean isHealthy) {
        super.eat(food);
        System.out.println("Iron Man is eating " + (isHealthy ? "healthy " : "") + food);
        return isHealthy;
    }

    // Overload that returns a summary String (different name previously)
    public String eat(String food, int quantity, String timeOfDay) {
        super.eat(food);
        String report = "Ate " + quantity + "x " + food + " during " + timeOfDay;
        System.out.println("Report: " + report);
        return report;
    }

    // Overload that returns calories consumed (different name previously)
    public int eat(String food, int quantity, int caloriesPerServing) {
        int total = quantity * caloriesPerServing;
        System.out.println("Total calories consumed from " + food + ": " + total);
        return total;
    }

    // Overload that declares a checked exception (renamed from eatWithRisk)
    public void eat(String food, boolean checkCompatibility, String system) throws IOException {
        if (checkCompatibility && "AlienFood".equals(food)) {
            throw new IOException("Food not compatible with " + system);
        }
        super.eat(food);
        System.out.println("Iron Man safely ate: " + food);
    }

    // Overload that throws a runtime exception for invalid input (renamed from eatOrThrow)
    public void eat(String food, int quantity, boolean strict) {
        if (strict && quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        eat(food, quantity);
    }
}

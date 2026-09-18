package com.mypractice.lambda.floors;

public class FactoryMethodPattern {

    public static void main(String[] args) {

        Flooring floor = FlooringFactory.getFlooring(12, 43);
        floor.installation();
    }
}

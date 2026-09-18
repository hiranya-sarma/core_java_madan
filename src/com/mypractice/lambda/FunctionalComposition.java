package com.mypractice.lambda;

public class FunctionalComposition {
    public static void main(String[] args) {

        Function<Square, Integer> fun1 = s->s.getArea();
        Function<Integer, Double> fun2 = area->Math.sqrt(area);

        fun2.compose(fun1);

    }
}

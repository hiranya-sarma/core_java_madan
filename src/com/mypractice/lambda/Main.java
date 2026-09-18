package com.mypractice.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
       MyIterface myInterface = () -> System.out.println("Hello functional interface");
       fun(myInterface);

       MathOperation add = (a, b)-> System.out.println("add: "+(a+b));
       add.operation(10,20);

       LengthOfString str = (str1) -> {
           int len = str1.length();
           System.out.println("Length of string: "+len);
           return len;
       };

       int l = str.length("Hello");
       System.out.println(l);

        Predicate<String> predicate = (str1) -> str1.length() > 5;

        Consumer<String> c = (str1) -> System.out.println("Consumer: "+str1);
        c.accept("Hello");
        System.out.println("----------------------------------------------");
        List<Integer> list = List.of(1,2,3,4,5);
        Consumer<Integer> c1 = (num) -> System.out.println("Consumer: "+num);

        printElements(list, c1);
        System.out.println("----------------------------------------------");
        Supplier<String> supplier = () -> "Hello supplier";
        System.out.println(supplier.get());
        Supplier<Double> randomNumber = ()->Math.random();
        Supplier<Double> randomNumber1 = Math::random;
        System.out.println(randomNumber.get());

        List<String> list1 = List.of("kit", "kat", "shake");
        Function<String, Integer> function = e -> e.length();
        List<Integer> list2 = map(list1, function);
        System.out.println(list2);

        Function<Runnable, Thread> threadGenerator1 = r -> new Thread(r);
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable r1 = threadGenerator.apply(()-> System.out.println("Hello thread-1"));
        Runnable r2 = threadGenerator.apply(()-> System.out.println("Hello thread-2"));
        Thread t1 = threadGenerator.apply(r1);
        Thread t2 = threadGenerator.apply(r2);
        t1.start();
        t2.start();
        threadGenerator.apply(()-> System.out.println("Hello thread-3")).start();
        System.out.println("---------------Optional-------------------------------");
        Optional<String> optional = Optional.of("Value");
        String str1 = optional.map(val->"Replaced").orElse("Default");
        System.out.println(str1);
        Optional<String> optionalFilter = optional.filter(val->val.equalsIgnoreCase("value"));
        System.out.println(optionalFilter.get());
        Optional<String> optionalFlatMap = optional.flatMap(val->Optional.of("Replaced by flatmap"));
        System.out.println(optionalFlatMap.get());
        //String str2 = Optional.empty().orElseGet(()-> "empty").toString();
        Object str2 = Optional.empty().orElseGet(()-> "empty");
        System.out.println(str2.toString());
        //ifPresentOrElse
        Optional<String> optional1 = Optional.of("www"); //null throws error
        optional1.ifPresentOrElse(System.out::print ,()-> System.out.println("optional1 is empty"));

        System.out.println("---------------Currying-------------------------------");
        Function<Integer,
                Function<Integer,
                        Function<Integer, Integer>>> add2 = a -> b -> c2 -> a + b + c2;
        // Fix a = 10
        Function<Integer, Function<Integer,Integer>> add10 = add2.apply(10);
        // Fix b = 20
        Function<Integer,Integer> add20 = add10.apply(20);

        Integer result = add20.apply(30);
        System.out.println("Currying: "+result);


    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> list2 = new ArrayList<>();
        for(T t: list){
            list2.add(function.apply(t));
        }
        return list2;
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t : list){
            consumer.accept(t);
        }
    }

    public static void fun(MyIterface myIterface){
        myIterface.myMethod();

    }
}

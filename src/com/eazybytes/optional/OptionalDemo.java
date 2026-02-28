package com.eazybytes.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
       //of, empty,ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        String email = null;
        String email2 = "abc@example.com";
//        Optional<String> optionalEmail = Optional.of(email);
//        System.out.println(optionalEmail);

        Optional<String> optionalEmail1 = Optional.ofNullable(email);
        System.out.println(optionalEmail1);

        Optional<String> optionalEmail2 = Optional.ofNullable(email2);
        System.out.println(optionalEmail2.get());

        if(optionalEmail2.isPresent()) {
            System.out.println(optionalEmail2.get());
        }else {
            System.out.println("Email2 is not present");
        }
        if(optionalEmail1.isPresent()) {
            System.out.println(optionalEmail1.get());
        }else {
            System.out.println("Email is not present");
        }
        System.out.println(optionalEmail1.orElse("default@example.com"));

        String defaultOptional2 = optionalEmail1.orElseGet(()->"default2@example.com");
        System.out.println(defaultOptional2);

        String result = "abc";
        Optional<String> optionalStr = Optional.of(result);
        optionalStr
                .filter(res->res.contains("abc"))
                .map(String::trim)
                .ifPresent(System.out::println);
    }
}

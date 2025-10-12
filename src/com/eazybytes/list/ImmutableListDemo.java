package com.eazybytes.list;

import java.util.ArrayList;
import java.util.List;

public class ImmutableListDemo {
    public static void main(String[] args) {
        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(123456);
        accountNums.add(1234567);
        accountNums.add(12345678);
        //accountNums = Collections.unmodifiableList(accountNums);
        List<Integer> immutableAccountNums = List.of(123456, 1234567, 12345678);
        //System.out.println(accountNums);
        System.out.println(immutableAccountNums);
        //addTenDollars(accountNums);
        addTenDollars(immutableAccountNums);
    }

    public static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(10);
        for (Integer num : accountNums){
            System.out.println("Ten Dollars Credited to account: "+num);
        }
        return accountNums;
    }
}

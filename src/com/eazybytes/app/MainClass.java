package com.eazybytes.app;

import com.eazybytes.model.Employee;
import com.eazybytes.model.Vehicle;
import com.eazybytes.utility.MyConstants;

import static java.lang.Math.PI;


public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Vehicle veh = new Vehicle();
        System.out.println("Inside Main Class");
        System.out.println(emp);
        System.out.println(veh);
        System.out.println(MyConstants.calculateTotalCost(9.99));
        System.out.println(PI);
    }
}

package com.eazybytes.app;

import com.eazybytes.model.Class1;
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

        Class1 model = new Class1();
        com.eazybytes.service.Class1 service = new com.eazybytes.service.Class1();

        MyOuterClass.MyInnerClass innerClass = new MyOuterClass.MyInnerClass();
        innerClass.display();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticInnerClass innerStatic = new OuterClass.StaticInnerClass();
        innerStatic.display();

        outer.display();

        AbstractClass innerAbstract = new AbstractClass() {
            void display() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        innerAbstract.display();
    }
}

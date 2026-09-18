package com.buchelka.oops.section7;

public class MainAccount {
    public static void main(String[] args) {
        /*
        Car car = new Car();
        System.out.println("make =" + car.getMake());
        System.out.println("Model =" + car.getModel());
        System.out.println("-------------------------------");
        car.describeCar();

        */

      //  Account bobsAccount = new Account("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        Account bobsAccount = new Account();

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
        System.out.println("--------------------------------");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmail());
        System.out.println(bobsAccount.getCustomerPhone());



    }
}

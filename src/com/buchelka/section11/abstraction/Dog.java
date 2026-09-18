package com.buchelka.section11.abstraction;

class Mammal {
    public Mammal(String type, String size, double weight) {
      //  super(type, size, weight);
    }

//    @Override
//    public void move(String speed) {
//
//        System.out.print(getExplicitType() + " ");
//        System.out.println( speed.equals("slow") ? "walks" : "runs");
//    }
//
//    public abstract void shedHair();

}

public class Dog extends Animal implements ITrackable{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public boolean isTracked() {
        int i1 = ITrackable.i;
        return false;
    }
}

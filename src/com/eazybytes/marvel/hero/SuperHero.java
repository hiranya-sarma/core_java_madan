package com.eazybytes.marvel.hero;

public interface SuperHero extends Person, Hero{

    String UNIVERSE_NAME = "Marvel";

    String usePower();

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicates Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

    default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I am in: " + liveLocation);
        return liveLocation;
    }

    private String method1() {
        String liveLocation = "USA";
        System.out.println("I am in: " + liveLocation);
        return liveLocation;
    }

    static String commonCharacterastics() {
        return "Superhuman abilities, Willingness to sacrifice";
    }

    @Override
    default void walk(){
        Person.super.walk();
    };
}

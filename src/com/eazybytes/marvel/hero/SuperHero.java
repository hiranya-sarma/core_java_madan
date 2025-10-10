package com.eazybytes.marvel.hero;

public interface SuperHero extends Person{

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
}

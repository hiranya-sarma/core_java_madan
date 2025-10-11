package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String usePower() {
        return "Spider Man is using his power";
    }

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicates Y or N
     * @return - Returns status
     */
    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "Spider Man is killing the villain";
        }else {
            return "Spider Man stopping the villain";
        }

    }

    @Override
   public String trackLiveLocation() {
        String liveLocation = "London";
        System.out.println("I am in: " + liveLocation);
        return liveLocation;
    }

    public static String commonCharacteristics() {
        return "Spiderman has superhuman strength, superhuman agility, superhuman speed, superhuman strength, superhuman durability, and superhuman power";
    }

    @Override
    public void walk() {
        System.out.println("Spider Man is walking");
    }
}

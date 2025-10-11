package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String usePower() {
        System.out.println(UNIVERSE_NAME);
        return "Iron Man is using his power";
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
            return "Iron Man is killing the villain";
        }else {
            return "Iron Man stopping the villain";
        }

    }
}

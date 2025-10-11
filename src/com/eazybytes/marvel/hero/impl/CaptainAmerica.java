package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {
    @Override
    public String usePower() {
        return "Captain America is using his power";
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
            return "Captain America is killing the villain";
        }else {
            return "Captain America stopping the villain";
        }

    }
}

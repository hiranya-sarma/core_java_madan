package com.globalsoftwaresupport.blockingqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed {
    private String name;
    private long startTime;

    public DelayedTask(String name, long delayInMillis) {
        this.name = name;
        this.startTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        if(this.startTime < ((DelayedTask)other).startTime){
            return -1;
        }
        if(this.startTime > ((DelayedTask)other).startTime){
            return 1;
        }
        return 0;
    }
    public String getName() {
        return name;
    }
}

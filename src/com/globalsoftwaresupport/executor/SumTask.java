package com.globalsoftwaresupport.executor;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    private int num;

    public SumTask(int num) {
        this.num = num;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}


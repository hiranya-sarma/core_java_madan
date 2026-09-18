package com.globalsoftwaresupport.forkjoin;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 10;
    private int start;
    private int end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end - start) <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("Direct compute: " + start + " to " + end);
            return sum;
        } else {
            int mid = (start + end) / 2;

            SumTask left = new SumTask(start, mid);
            SumTask right = new SumTask(mid + 1, end);

            left.fork();              // asynchronously execute left
            long rightResult = right.compute(); // compute right directly
            long leftResult = left.join();      // wait for left

            return leftResult + rightResult;
        }
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(1, 100);

        long result = pool.invoke(task);

        System.out.println("Final Result: " + result);
    }
}

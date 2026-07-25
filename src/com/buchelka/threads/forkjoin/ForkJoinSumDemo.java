package com.buchelka.threads.forkjoin;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumDemo {
     /*From GEMINI*/

    // The threshold: If an array slice has 10,000 or fewer items, compute it directly.
    // Otherwise, break it down further.
    private static final int THRESHOLD = 3;

    // 1. Define the ForkJoin task by extending RecursiveTask<Long>
    // (We use Long because the final result is a number)

    static class SumTask extends RecursiveTask<Long>{

        private final int[] array;
        private final int start;
        private final int end;

        public SumTask(int[] array, int start, int end){
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute(){
            int length = end - start;
            if(length <= THRESHOLD){
                long sum = 0;
                for(int i = start; i < end; i++){
                   sum += array[i];
                }
                return sum;
            }

            // Divide phase: Split the task exactly in half
            int midpoint = start + length /2;
            SumTask leftTask = new SumTask(array, start, midpoint);
            SumTask rightTask = new SumTask(array, midpoint, end);

            // Fork phase: Push the left task onto the queue for other threads to steal
            leftTask.fork();

            // Compute phase: The current thread immediately tackles the right half
            long rightResult = rightTask.compute();

            // Join phase: Read the left result (or wait for it if still running)
            long leftResult = leftTask.join();

            // Conquer phase: Combine the results
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        int testLength = 10;
        // Create a dummy array of 1 million numbers (all 1s for easy checking)
        //int[] numbers = new int[1_000_000];
        int[] numbers = new int[10];
        for(int i = 0; i < testLength; i++){
            numbers[i] = i;
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        // 2. Instantiate the ForkJoinPool (uses available CPU cores automatically)
        try(ForkJoinPool pool = new ForkJoinPool()){
            // 3. Create the initial root task covering the entire array
            SumTask rootTask = new SumTask(numbers, 0, testLength);

            System.out.println("Submitting task to ForkJoinPool...");

            long startTime = System.currentTimeMillis();

            // 4. Submit to pool and get the final result
            long totalSum = pool.invoke(rootTask);

            long duration = System.currentTimeMillis() - startTime;

            System.out.println("--- Results ---");
            System.out.println("Calculated Sum : " + totalSum);
            System.out.println("Time taken     : " + duration + " ms");
            System.out.println("Pool parallelism level: " + pool.getParallelism());
        }

    }

}








































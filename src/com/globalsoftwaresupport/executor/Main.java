package com.globalsoftwaresupport.executor;

import java.util.concurrent.*;

public class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Basic Example (Executor)
        /*
        Executor executor = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            executor.execute(new SimpleTask(i));
        }
        */

        //ExecutorService (Lifecycle Control)
//        ExecutorService service = Executors.newFixedThreadPool(3);
//        for(int i=0;i<5;i++){
//            service.submit(new Task(i));
//        }
//        service.shutdown();

        //Callable + Future (Return Values)
//        ExecutorService service2 = Executors.newFixedThreadPool(2);
//        Future<Integer> future = service2.submit(new SumTask(10));
//        System.out.println("Result: "+future.get());
//        service2.shutdown();

        //Scheduled Executor
//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.schedule(()->{
//            System.out.println("Executed after 3 seconds");
//        },3, TimeUnit.SECONDS);
//        scheduler.shutdown();

        //ThreadPoolExecutor (Advanced Control)
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2));
        for(int i=1;i<=8;i++){
            int taskId = i;
            executor.execute(()->{
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
                try { Thread.sleep(2000); } catch (Exception e) {}
            });
        }
        executor.shutdown();

    }
}

package com.buchelka.threads.executor.scheduledexecutorservice;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        var dtf = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.MEDIUM,
                FormatStyle.LONG
        );

        Callable<ZonedDateTime> waitThenDoIt = ()->{
            ZonedDateTime zdt = null;
            try{
                TimeUnit.SECONDS.sleep(2);
                zdt = ZonedDateTime.now();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return zdt;
        };

        var threadPool = Executors.newFixedThreadPool(2);

        List<Callable<ZonedDateTime>> list = Collections.nCopies(4, waitThenDoIt);

        try{
            System.out.println("--->"+ ZonedDateTime.now().format(dtf));
            List<Future<ZonedDateTime>> futureList = threadPool.invokeAll(list);

            for(Future<ZonedDateTime> result : futureList){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(result.get().format(dtf));
                }catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            threadPool.shutdown();
        }

        Runnable dateTask = ()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("a " + ZonedDateTime.now().format(dtf));
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        System.out.println("--->"+ ZonedDateTime.now().format(dtf));
        /**ScheduledExecutorService */
        /*
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        executor.schedule(()->{
            System.out.println("Scheduled task is running. " + ZonedDateTime.now().format(dtf));
        }, 2, TimeUnit.SECONDS);
        */

        /** ScheduledThreadPool */

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);

        /*
        for(int i=0; i<4; i++){
            // Capture the current value of i in a variable that doesn't change
            final int taskId = i;
            executor.schedule(()->{
                System.out.printf("Scheduled-1 task-%d is running" + ZonedDateTime.now().format(dtf)+"\n",taskId);
            }, 2*(i+1), TimeUnit.SECONDS);
        }

         */

        /*
        var scheduledTask = executor.scheduleWithFixedDelay(
                ()->System.out.println("Scheduled task-fixedDelay is running. " + ZonedDateTime.now().format(dtf)),
                2,
                2,
                TimeUnit.SECONDS);

        */
        /*
        var scheduledTask = executor.scheduleWithFixedDelay(
                dateTask,
                2,
                2,
                TimeUnit.SECONDS);

         */
        var scheduledTask = executor.scheduleAtFixedRate(
                dateTask,
                2,
                2,
                TimeUnit.SECONDS);

        var scheduledTask2 = executor.scheduleAtFixedRate(
                ()->System.out.println("b " + ZonedDateTime.now().format(dtf)),
                2,
                2,
                TimeUnit.SECONDS);


       long time = System.currentTimeMillis();
       while(!scheduledTask.isDone()){
           try {
               TimeUnit.SECONDS.sleep(2);
               if((System.currentTimeMillis() - time)/1000 > 10) {
                   scheduledTask.cancel(true);
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

        executor.shutdown();

    }
}












































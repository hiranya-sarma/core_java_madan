package com.buchelka.threads.parallelstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class VisitorList {

    private static final CopyOnWriteArrayList<Person> masterList;
    static {
        masterList = Stream.generate(Person::new)
                .distinct()
                .limit(2500)
                .collect(CopyOnWriteArrayList::new,
                        CopyOnWriteArrayList::add,
                        CopyOnWriteArrayList::addAll);
    }

    private static final ArrayBlockingQueue<Person> newVisitors = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {

        Runnable producer = ()->{
            Person visitor = new Person();
            System.out.println("Queueing " + visitor+"\n");

            boolean queued = false;
            try {
                queued = newVisitors.offer(visitor, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException\n");
            }

            if(queued){
               // System.out.println("Visitor added to queue\n"+ newVisitors+"\n");
               // System.out.println("---------------------------------");
            }else{
                System.out.println("Queue is full, cannot add visitor\n" + visitor);
                System.out.println("Draining queue and writing data to file\n" + newVisitors + "\n");
                List<Person> tempList = new ArrayList<>();
                newVisitors.drainTo(tempList);
                List<String> lines = new ArrayList<>();
                tempList.forEach(customer->lines.add(customer.toString()));
                lines.add(visitor.toString());

                try {
                    Files.write(Paths.get("DrainedQueue.txt"), lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable consumer = ()->{
          String threadName = Thread.currentThread().getName();
          System.out.println(threadName+" Polling queue " + newVisitors.size());
          Person visitor = newVisitors.poll();
          if (visitor != null){
              System.out.println(threadName+" Polled visitor " + visitor);
              if(!masterList.contains(visitor)){
                  masterList.add(visitor);
                  System.out.println("--> New visitor gets coupon!:  " + visitor);
              }
          }
          System.out.println(threadName +" done " + newVisitors.size());
        };

        ScheduledExecutorService producerExecutorService = Executors.newSingleThreadScheduledExecutor();
        producerExecutorService.scheduleWithFixedDelay(producer, 0, 1, TimeUnit.SECONDS);

        ScheduledExecutorService consumerPool = Executors.newSingleThreadScheduledExecutor();
        consumerPool.scheduleWithFixedDelay(producer, 0, 1, TimeUnit.SECONDS);

        for(int i=0; i<3; i++){
            consumerPool.scheduleAtFixedRate(consumer, 6, 3, TimeUnit.SECONDS);
        }

        while(true){
            try {
                if(!producerExecutorService.awaitTermination(10, TimeUnit.SECONDS))
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        producerExecutorService.shutdown();

        while(true){
            try {
                if(!consumerPool.awaitTermination(3, TimeUnit.SECONDS))
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        consumerPool.shutdown();


    }
}

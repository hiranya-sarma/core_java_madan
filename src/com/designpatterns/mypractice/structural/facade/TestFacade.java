package com.designpatterns.mypractice.structural.facade;

public class TestFacade {
    public static void main(String[] args) {
        ScheduleServerFacade scheduleServerFacade = new ScheduleServerFacade(new ScheduleServer());
        scheduleServerFacade.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        scheduleServerFacade.stopServer();
    }
}

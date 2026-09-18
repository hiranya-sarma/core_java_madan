package com.buchelka.threads.basics;

public class BasicSynchronizedDemo implements Runnable{

    String name;

    // 1. Any regular Java object can act as an intrinsic lock

    private static final Object bathroomDoorLock = new Object();
    public BasicSynchronizedDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ": Walking to the bathroom...");
        // 2. SYNCHRONIZED BLOCK (Grabs the intrinsic lock of 'bathroomDoorLock')

        synchronized (bathroomDoorLock){
            System.out.println("🔒 " + name + " ENTERED the bathroom and LOCKED the door.");

            try {
                // Simulate spending 2 seconds inside
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("   " + name + " is finished!");
            System.out.println("🔓 " + name + " UNLOCKED the door and stepped out.");
        }// 3. LOCK IS AUTOMATICALLY RELEASED HERE when the block ends!
    }



  /*
  public static void useBathroom(String name) {
        System.out.println(name + ": Walking to the bathroom...");

        // 2. SYNCHRONIZED BLOCK (Grabs the intrinsic lock of 'bathroomDoorLock')
        synchronized (bathroomDoorLock) {

            System.out.println("🔒 " + name + " ENTERED the bathroom and LOCKED the door.");

            try {
                // Simulate spending 2 seconds inside
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("   " + name + " is finished!");
            System.out.println("🔓 " + name + " UNLOCKED the door and stepped out.");

        } // 3. LOCK IS AUTOMATICALLY RELEASED HERE when the block ends!
    }
   */


}

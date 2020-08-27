package com.saothienhat.threadstate;

import sun.rmi.runtime.Log;

public class BlockedStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BlockedStateThread());
        Thread t2 = new Thread(new BlockedStateThread());

        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println("State of Thread 1: " + t1.getState());
        System.out.println("State of Thread 2: " + t2.getState());

    }


}

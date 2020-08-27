package com.saothienhat.threadstate;

public class BlockedStateThread implements Runnable {
    @Override
    public void run() {
        commonResource();
    }

    public static synchronized void commonResource() {
        System.out.println("The current Thread access to this resource is: " + Thread.currentThread().getName() + " , with state: " + Thread.currentThread().getState());
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        }
    }
}

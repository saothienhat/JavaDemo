package com.saothienhat.threadstate;

import sun.rmi.runtime.Log;

public class WaitingStateThread implements Runnable {
    public void run() {
        System.out.println("\tChildren Thread start its task...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //Log.error("Thread interrupted", e);
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("\tParent Thread state: " + WaitingStateMain.t1.getState());
        System.out.println("\tChildren Thread finish its task !");
    }
}

package com.saothienhat.threadstate;

import sun.rmi.runtime.Log;

/*
    1) We've created and started the t1
    2) t1 creates a t2 and starts it
    3) While the processing of t2 continues, we call t2.join(), this puts t1 in WAITING state until t2 has finished execution
    4) Since t1 is waiting for t2 to complete, we're calling t1.getState() from t2
 */
public class WaitingStateMain implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingStateMain());
        t1.start();
    }

    public void run() {
        System.out.println("Parent Thread start its task...");
        Thread t2 = new Thread(new WaitingStateThread());
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Parent Thread finish its task !");
    }
}

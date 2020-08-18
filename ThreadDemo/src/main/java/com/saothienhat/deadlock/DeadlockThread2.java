package com.saothienhat.deadlock;

public class DeadlockThread2 implements Runnable {

    private Long value1;
    private Long value2;
    private String threadName;

    public DeadlockThread2(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        synchronized (value2) {
            System.out.println("Thread 2: Holding lock 2...");

            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (value1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }

    public Long getValue1() {
        return value1;
    }

    public void setValue1(Long value1) {
        this.value1 = value1;
    }

    public Long getValue2() {
        return value2;
    }

    public void setValue2(Long value2) {
        this.value2 = value2;
    }
}

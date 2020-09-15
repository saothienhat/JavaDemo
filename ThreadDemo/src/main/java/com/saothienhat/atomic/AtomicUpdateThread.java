package com.saothienhat.atomic;

public class AtomicUpdateThread extends Thread {
    private Counter counter;

    public AtomicUpdateThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        counter.increase();
    }
}

package com.saothienhat.atomic;

public class AtomicMain {

    public static void main(String[] args) throws InterruptedException {
        final int NUMBER_THREADS = 100;
        Counter counter = new Counter();
        System.out.println("Initial Counter = " + counter.get());

        AtomicUpdateThread[] threads = new AtomicUpdateThread[NUMBER_THREADS];

        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new AtomicUpdateThread(counter);
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }

        System.out.println("Final Counter = " + counter.get());
    }
}

package com.saothienhat.deadlock;

public class DeadlockThreadMain {

    public static void main(String[] args) {
        Long value1 = 1L;
        Long value2 = 2L;

        DeadlockThread thread1 = new DeadlockThread("Thread 1");
        DeadlockThread2 thread2 = new DeadlockThread2("Thread 2");

        thread1.setValue1(value1);
        thread1.setValue2(value2);

        thread2.setValue1(value1);
        thread2.setValue2(value2);

        thread1.run();
        thread2.run();
    }

}

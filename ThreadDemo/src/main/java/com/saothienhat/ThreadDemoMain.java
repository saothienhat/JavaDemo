package com.saothienhat;

public class ThreadDemoMain {

    public static void main(String[] args) {
        System.out.println("Hello Thread Demo");

        Thread test = new Thread(() -> System.out.println("hello man"));
        test.start();

        Thread binh = new Thread() {
            @Override
            public void run() {
                System.out.println(("binh"));
                final State state = this.getState();
                System.out.println(state);
                
            }
        };
        binh.start();

    }
}

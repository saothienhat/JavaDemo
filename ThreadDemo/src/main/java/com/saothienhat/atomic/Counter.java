package com.saothienhat.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger value = new AtomicInteger();

    public int get() {
        return value.get();
    }

    public void increase() {
        value.incrementAndGet();
    }

    public void decrease() {
        value.decrementAndGet();
    }
}

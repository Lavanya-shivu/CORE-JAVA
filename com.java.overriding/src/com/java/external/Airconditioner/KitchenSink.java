package com.java.external.Airconditioner;

import com.java.internal.Sink;

public class KitchenSink extends Sink {
    public KitchenSink() {
        System.out.println("No-argument constructor in KitchenSink");
    }

    public void cleanDishes() {
        System.out.println("Cleaning dishes in the kitchen sink.");
    }

    public void clog() {
        System.out.println("Sink is clogged.");
    }

    public void clog(Sink sink) {
        if (sink != null) {
            System.out.println("Trying to unclog the sink.");
        } else {
            System.out.println("No sink to unclog.");
        }
    }
}

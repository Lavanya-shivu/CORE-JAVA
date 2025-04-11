package com.java.runner;

import com.java.external.Airconditioner.KitchenSink;

public class SinkRunner {
    public static void main(String[] args) {
        KitchenSink kitchenSink = new KitchenSink();
        kitchenSink.drainWater();         // from base class
        System.out.println("--------------------------");

        kitchenSink.cleanDishes();        // own method
        kitchenSink.clog();               // own method
        kitchenSink.clog(kitchenSink);    // with object
        kitchenSink.clog(null);           // with null
        System.out.println("==========================");
    }
}

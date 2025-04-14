package com.java.external.Airconditioner;

import com.java.internal.Sink;

public class WashroomSink {
    public void  washroomSink(Sink sink){
        if(sink!= null){
            if(sink instanceof KitchenSink){
                KitchenSink kitchenSink = (KitchenSink) sink;
                kitchenSink.cleanDishes();
                kitchenSink.clog();
            }
            else {
                sink.drainWater();
                System.err.println("Sink is WashroomSink");
            }
        }
        else {
            System.err.println("Sink is null");
        }
    }
}

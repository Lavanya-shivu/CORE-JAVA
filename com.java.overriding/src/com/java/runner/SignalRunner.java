package com.java.runner;

import com.java.external.Airconditioner.TrafficSignal;

public class SignalRunner {
    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();
        trafficSignal.transmit();            // From base class
        System.out.println("--------------------------");

        trafficSignal.changeColor();         // Subclass method
        trafficSignal.stop();                // Subclass method
        trafficSignal.stop(trafficSignal);   // With object
        trafficSignal.stop(null);            // With null
        System.out.println("==========================");
    }
}

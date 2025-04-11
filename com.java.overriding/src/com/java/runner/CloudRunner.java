package com.java.runner;

import com.java.external.Airconditioner.RainCloud;

public class CloudRunner {
    public static void main(String[] args) {
        RainCloud rainCloud = new RainCloud();
        rainCloud.floatInSky();                // From base class
        System.out.println("--------------------------");

        rainCloud.releaseRain();              // Subclass method
        rainCloud.storm();                    // Subclass method
        rainCloud.storm(rainCloud);           // With object
        rainCloud.storm(null);                // With null
        System.out.println("==========================");
    }
}

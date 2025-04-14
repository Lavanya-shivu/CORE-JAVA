package com.java.external.Airconditioner;

import com.java.internal.Cloud;

public class WeatherManager {
    public void manage(Cloud cloud) {
        if (cloud != null) {
            System.out.println("Managing the cloud...");

            if (cloud instanceof RainCloud) {
                RainCloud rainCloud = (RainCloud) cloud;
                rainCloud.releaseRain();
                rainCloud.storm();
            } else {
                cloud.floatInSky();
                System.out.println("The cloud is peacefully floating in the sky.");
            }
        } else {
            System.err.println("No cloud to manage.");
        }
    }
}

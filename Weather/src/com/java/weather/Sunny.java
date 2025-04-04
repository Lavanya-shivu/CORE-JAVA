package com.java.weather;

import java.util.Objects;

public class Sunny {
    public Sunny(Weather weather) {
        System.out.println("Running constructor in Sunny");
        if (Objects.nonNull(weather)) {
            weather.forecast();
        } else {
            System.out.println("Null value detected");
        }
    }
    public void condition() {
        System.out.println("Condition is rising");
    }


}

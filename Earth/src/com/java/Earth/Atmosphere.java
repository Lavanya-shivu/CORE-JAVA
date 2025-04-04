package com.java.Earth;

import java.util.Objects;

public class Atmosphere {
    public Atmosphere(Earth earth) {
        System.out.println("Running constructor in Atmosphere");
        if (Objects.nonNull(earth)) {
            earth.describe();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void oxygenLevel() {
        System.out.println("Oxygen level is stable at 21%");
    }
}

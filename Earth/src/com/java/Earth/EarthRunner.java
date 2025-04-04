package com.java.Earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Atmosphere atmosphere = new Atmosphere(earth);
        atmosphere.oxygenLevel();
    }
}

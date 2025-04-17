package com.java.internal;

public class Sunlight {
    private String timeOfDay;
    private String intensity;

    public Sunlight(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
    public void shine() {

        System.out.println("Sunlight is shining brightly.");
    }
    @Override
    public String toString() {
        return "Sunlight [Time of Day: " + timeOfDay + ", Intensity: " + intensity + "]";
    }
}

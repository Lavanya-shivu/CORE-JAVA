package com.java.internal;

public class Moon {
    private String phase;
    private int brightness;

    public Moon() {
        this.phase = "Full";
        this.brightness = 80;
    }

    public Moon(String phase, int brightness) {
        this.phase = phase;
        this.brightness = brightness;
    }
    public void setPhase(String phase) {

        this.phase = phase;
    }

    public void rise()
    {
        System.out.println("The moon is rising.");
    }
    @Override
    public String toString() {

        return "Moon [Phase: " + phase + ", Brightness: " + brightness + "%]";
    }
}

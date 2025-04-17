package com.java.internal;

public class Snow {
    private String type;
    private int temperature;

    public Snow(String type) {
        this.type = type;
    }

    public Snow() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void freeze() {
        System.out.println("Snow is freezing everything around.");
    }
    @Override
    public String toString() {
        return "Snow [Type: " + type + ", Temperature: " + temperature + "°C]";
    }
}

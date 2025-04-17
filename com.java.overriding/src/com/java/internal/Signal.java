package com.java.internal;

public class Signal {
    private String type;
    private int frequency;

    public Signal(String type, int frequency) {
        this.type = type;
        this.frequency = frequency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void transmit() {

        System.out.println("Signal is being transmitted.");
    }
    @Override
    public String toString() {
        return "Signal [Type: " + type + ", Frequency: " + frequency + "Hz]";
    }
}

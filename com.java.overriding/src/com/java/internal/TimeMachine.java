package com.java.internal;

public class TimeMachine {
    private String model;
    private String destination;

    public TimeMachine(String model) {
        this.model = model;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void activate() {
        System.out.println("Time machine is activated.");
    }
    @Override
    public String toString() {
        return "TimeMachine [Model: " + model + ", Destination: " + destination + "]";
    }
}

package com.java.internal;

public class Dream {
    private String dreamType;
    private int duration;

    public Dream() {
    }

    public Dream(String dreamType, int duration) {
        this.dreamType = dreamType;
        this.duration = duration;
    }

    public void setDreamType(String dreamType) {
        this.dreamType = dreamType;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void sleep() {
        System.out.println("Entering a dream during sleep.");
    }
    @Override
    public String toString() {
        return "Dream Type: " + dreamType + ", Duration: " + duration + " minutes";
    }
}

package com.java.internal;

public class Donut {
    private String flavor;
    private boolean isFilled;

    public Donut() {
    }

    public Donut(String flavor, boolean isFilled) {
        this.flavor = flavor;
        this.isFilled = isFilled;
    }

    // Setter for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Setter for isFilled
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public void fry() {
        System.out.println("Donut is being fried to perfection!");
    }
}

package com.java.internal;

public class Candy {
    private String flavor;
    private String type;

    public Candy() {
    }

    public Candy(String flavor, String type) {
        this.flavor = flavor;
        this.type = type;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void make() {
        System.out.println("Making a basic candy!");
    }
    @Override
    public String toString() {
        return "Candy Flavor: " + flavor + ", Candy Type: " + type;
    }
}

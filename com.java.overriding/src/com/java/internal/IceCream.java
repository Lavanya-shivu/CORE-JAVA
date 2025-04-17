package com.java.internal;

public class IceCream {
    private String flavor;
    private String size;

    public IceCream() {
    }

    public IceCream(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void freeze() {
        System.out.println("Ice cream is frozen and ready to serve!");
    }
    @Override
    public String toString() {
        return "IceCream [Flavor: " + flavor + ", Size: " + size + "]";
    }
}

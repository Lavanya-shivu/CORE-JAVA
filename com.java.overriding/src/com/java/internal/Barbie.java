package com.java.internal;

public class Barbie {
    protected String fashionStyle;
    protected String accessories;

    public Barbie() {
        // default constructor
    }

    public Barbie(String fashionStyle, String accessories) {
        this.fashionStyle = fashionStyle;
        this.accessories = accessories;
    }

    public void setFashionStyle(String fashionStyle) {
        this.fashionStyle = fashionStyle;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public void style() {
        System.out.println("Barbie has a fabulous sense of style!");
    }
    @Override
    public String toString() {
        return "Fashion Style: " + fashionStyle + ", Accessories: " + accessories;
    }
}

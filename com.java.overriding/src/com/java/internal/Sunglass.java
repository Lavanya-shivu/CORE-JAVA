package com.java.internal;

public class Sunglass {
    private String brand;
    private String lensType;

    public Sunglass(String brand) {
        this.brand = brand;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
    public void wear() {
        System.out.println("Wearing sunglasses for protection and style");
    }
    @Override
    public String toString() {
        return "Sunglass [Brand: " + brand + ", Lens Type: " + lensType + "]";
    }
}

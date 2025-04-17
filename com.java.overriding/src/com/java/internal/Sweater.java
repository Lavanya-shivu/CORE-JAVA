package com.java.internal;

public class Sweater {
    private String color;
    private String material;

    public Sweater(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

        public void wear() {

            System.out.println("Wearing the sweater to stay warm.");
        }
    @Override
    public String toString() {
        return "Sweater [Color: " + color + ", Material: " + material + "]";
    }
    }


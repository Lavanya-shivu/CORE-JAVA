package com.java.internal;

public class Table {
    private String material;
    private String color;

    public Table(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void placeItems() {
        System.out.println("Items are placed on the table.");
    }
    @Override
    public String toString() {
        return "Table [Material: " + material + ", Color: " + color + "]";
    }
}

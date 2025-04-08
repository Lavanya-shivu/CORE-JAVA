package com.java.internal.Tank;

public class Varenty {
    public void tankVarenty() {
        Tank tank = new Tank();

        // Print initial default values
        System.out.println("Initial Tank Values:");
        System.out.println("Brand: " + tank.getBrand());
        System.out.println("Color: " + tank.getColor());
        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Prize: " + tank.getPrize());
        System.out.println("Worth: " + tank.isWorth());

        // Using package-access setters to update values
        tank.setBrand("Raj");
        tank.setColor("White");
        tank.setCapacity(28.5);
        tank.setPrize(2500);
        tank.setWorth(false);

        // Print updated values
        System.out.println("\nUpdated tank Values:");
        System.out.println("Brand: " + tank.getBrand());
        System.out.println("Color: " + tank.getColor());
        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Prize: " + tank.getPrize());
        System.out.println("Worth: " + tank.isWorth());
    }
}

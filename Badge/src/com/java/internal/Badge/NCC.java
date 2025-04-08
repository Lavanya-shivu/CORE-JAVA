package com.java.internal.Badge;

public class NCC {
    public void badgeNCC() {
        Badge badge = new Badge();

        // Print initial default values
        System.out.println("Initial Badge Values:");
        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Prize: " + badge.getPrize());
        System.out.println("Valid: " + badge.isValid());

        // Using package-access setters to update values
        badge.setName("NCC");
        badge.setColor("Blue");
        badge.setMaterial("Velvet");
        badge.setPrize(100);
        badge.setValid(true);

        // Print updated values
        System.out.println("\nUpdated Badge Values:");
        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Prize: " + badge.getPrize());
        System.out.println("Valid: " + badge.isValid());
    }
}

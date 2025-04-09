package com.java;
import com.java.internal.Gym.Gym;

public class HealthInspector {
    public void inspectGym() {
        Gym gym = new Gym();

        // Only getters allowed from a different package
        System.out.println("\n--- Health Inspector Report ---");
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Open 24/7: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}

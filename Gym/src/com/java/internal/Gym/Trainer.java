package com.java.internal.Gym;

public class Trainer {
    public void manageGym() {
        Gym gym = new Gym();

        System.out.println("Update gym info");
        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Open 24/7: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());

        // Update gym details using setters
        gym.setName("Muscle Factory");
        gym.setLocation("Uptown");
        gym.setMembers(150);
        gym.setOpen24Hours(false);
        gym.setMonthlyFee(1800.00);

        System.out.println("Update gym details");
        System.out.println("Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Members: " + gym.getMembers());
        System.out.println("Open 24/7: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}

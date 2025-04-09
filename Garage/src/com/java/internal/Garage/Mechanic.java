package com.java.internal.Garage;

public class Mechanic {
        public void serviceGarage() {
            Garage garage = new Garage();

            System.out.println("Update garage info");
            System.out.println("Name: " + garage.getName());
            System.out.println("Location: " + garage.getLocation());
            System.out.println("Total Cars: " + garage.getTotalCars());
            System.out.println("Open: " + garage.isOpen());
            System.out.println("Service Cost: " + garage.getServiceCost());

            // Updating values using setters
            garage.setName("AutoCare Garage");
            garage.setLocation("Uptown");
            garage.setTotalCars(25);
            garage.setIsOpen(false);
            garage.setServiceCost(999.99);

            System.out.println("\n--- Updated Garage Info ---");
            System.out.println("Name: " + garage.getName());
            System.out.println("Location: " + garage.getLocation());
            System.out.println("Total Cars: " + garage.getTotalCars());
            System.out.println("Open: " + garage.isOpen());
            System.out.println("Service Cost: " + garage.getServiceCost());
        }
}

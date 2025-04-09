package com.java.internal.Apartment;

public class Resident {
    public void liveInApartment() {
        Apartment apartment = new Apartment();

        System.out.println("--- Initial Apartment Info");
        System.out.println("Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Flats: " + apartment.getNumberOfFlats());
        System.out.println("Has Parking: " + apartment.isHasParking());
        System.out.println("Maintenance Fee: " + apartment.getMaintenanceFee());

        // Modify values using setters
        apartment.setName("Sunrise Residency");
        apartment.setLocation("Hill View");
        apartment.setNumberOfFlats(80);
        apartment.setHasParking(false);
        apartment.setMaintenanceFee(3000.00);

        System.out.println("\n--- Updated Apartment Info ---");
        System.out.println("Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Flats: " + apartment.getNumberOfFlats());
        System.out.println("Has Parking: " + apartment.isHasParking());
        System.out.println("Maintenance Fee: " + apartment.getMaintenanceFee());
    }
}

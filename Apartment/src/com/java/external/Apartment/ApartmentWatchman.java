package com.java.external.Apartment;

import com.java.internal.Apartment.Apartment;

public class ApartmentWatchman {
    public void watchApartment() {
        Apartment apartment = new Apartment();

        System.out.println("Watchman data");
        System.out.println("Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Flats: " + apartment.getNumberOfFlats());
        System.out.println("Has Parking: " + apartment.isHasParking());
        System.out.println("Maintenance Fee: " + apartment.getMaintenanceFee());
    }
}

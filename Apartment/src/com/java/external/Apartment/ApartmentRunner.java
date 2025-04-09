package com.java.external.Apartment;

import com.java.internal.Apartment.Resident;

public class ApartmentRunner {
    public static void main(String[] args) {
        Resident resident = new Resident();
        resident.liveInApartment();

        ApartmentWatchman watchman = new ApartmentWatchman();
        watchman.watchApartment();
    }
}

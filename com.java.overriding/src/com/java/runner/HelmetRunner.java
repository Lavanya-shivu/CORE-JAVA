package com.java.runner;

import com.java.internal.Ride;

public class HelmetRunner {
    public static void main(String[] args) {
        Ride ride = new Ride();
        ride.protect();
        System.out.println("--------------------------");

        ride.features();
        ride.secure();
        ride.secure(ride);  // non-null
        ride.secure(null);          // null
        System.out.println("==========================");
    }
}

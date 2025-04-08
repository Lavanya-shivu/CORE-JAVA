package com.java.external.PostOffice;

import com.java.internal.PostOffice.PostOffice;

public class PublicUser {
    public void postPublicuse() {
        PostOffice office = new PostOffice();

        // Can only use public getters
        System.out.println("update Public User date");
        System.out.println("Name: " + office.getName());
        System.out.println("Location: " + office.getLocation());
        System.out.println("Pincode: " + office.getPincode());
        System.out.println("Opening Time: " + office.getOpenTime());
        System.out.println("Is Government: " + office.isGovernment());
    }
}

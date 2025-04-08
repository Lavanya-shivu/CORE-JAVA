package com.java.internal.PostOffice;

public class Employee {
    public void postOfficeEmployee() {
        PostOffice office = new PostOffice();

        // Set new values
        office.setName("Bangalore GPO");
        office.setLocation("BTM");
        office.setPincode(560025);
        office.setOpenTime("8:30 AM");
        office.setGovernment(true);

        // Display updated values
        System.out.println("Employee values");
        System.out.println("Name: " + office.getName());
        System.out.println("Location: " + office.getLocation());
        System.out.println("Pincode: " + office.getPincode());
        System.out.println("Opening Time: " + office.getOpenTime());
        System.out.println("Is Government: " + office.isGovernment());
    }
}

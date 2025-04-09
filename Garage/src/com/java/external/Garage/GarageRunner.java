package com.java.external.Garage;

import com.java.internal.Garage.Mechanic;

public class GarageRunner {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        mechanic.serviceGarage();

        Inspector inspector = new Inspector();
        inspector.inspectGarage();
    }
}

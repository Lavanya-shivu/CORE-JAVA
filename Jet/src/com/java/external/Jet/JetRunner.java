package com.java.external.Jet;

import com.java.internal.Jet.Engineer;

public class JetRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.jetEngineer();

        System.out.println();

        Pilot pilot = new Pilot();
        pilot.jetPilot();
    }
}

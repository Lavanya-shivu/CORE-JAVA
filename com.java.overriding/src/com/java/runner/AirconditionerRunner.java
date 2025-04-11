package com.java.runner;

import com.java.external.Airconditioner.Lgairconditioner;

public class AirconditionerRunner {
    public static void main(String[] args) {
        Lgairconditioner lgairconditioner = new Lgairconditioner();
        lgairconditioner.cool();
        System.out.println("--------------------------");

        lgairconditioner.features();
        lgairconditioner.control();
        lgairconditioner.control(lgairconditioner);  // with non-null
        lgairconditioner.control(null);      // with null
        System.out.println("==========================");
    }
}

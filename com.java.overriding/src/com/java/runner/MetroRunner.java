package com.java.runner;

import com.java.external.Airconditioner.SmartMetro;

public class MetroRunner {
    public static void main(String[] args) {
        SmartMetro metro = new SmartMetro();
        metro.travel();
        System.out.println("--------------------------");

        metro.schedule();
        metro.destination();
        metro.destination(metro);
        metro.destination(null);
        System.out.println("==========================");
    }
}

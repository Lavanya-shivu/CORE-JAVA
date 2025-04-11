package com.java.runner;

import com.java.external.Airconditioner.WoolSweater;

public class SweaterRunner {
    public static void main(String[] args) {
        WoolSweater sweater = new WoolSweater();
        sweater.wear();
        System.out.println("--------------------------");

        sweater.fabric();
        sweater.fold();
        sweater.fold(sweater);
        sweater.fold(null);
        System.out.println("==========================");
    }
}

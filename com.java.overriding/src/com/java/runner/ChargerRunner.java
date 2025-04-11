package com.java.runner;

import com.java.external.Airconditioner.PhoneCharger;

public class ChargerRunner {
    public static void main(String[] args) {
        PhoneCharger phoneCharger = new PhoneCharger();
        phoneCharger.supplyPower();
        System.out.println("--------------------------");

        phoneCharger.specs();
        phoneCharger.connect();
        phoneCharger.connect(phoneCharger);  // non-null
        phoneCharger.connect(null);           // null
        System.out.println("==========================");
    }
}

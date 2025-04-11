package com.java.runner;

import com.java.external.Airconditioner.HouseKey;

public class KeyRunner {
    public static void main(String[] args) {
        HouseKey houseKey = new HouseKey();
        houseKey.insert();
        System.out.println("--------------------------");

        houseKey.twist();
        houseKey.unlock();
        houseKey.unlock(houseKey);
        houseKey.unlock(null);
        System.out.println("==========================");
    }
}

package com.java.runner;

import com.java.external.Airconditioner.Rose;
import com.java.internal.FlowerPot;
import com.java.internal.Pot;

public class PotRunner {
    public static void main(String[] args) {
        Pot pot = new Pot();
        pot.soil();

        FlowerPot flowerPot = new FlowerPot();
        flowerPot.flower();

    }
}

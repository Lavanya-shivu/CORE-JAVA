package com.java.Runner;

import com.java.external.cactus.Cactus;
import com.java.internal.cactus.Plant;
import com.java.internal.cactus.Thing;

public class CactusRunner {
    public static void main(String[] args) {
        System.out.println("Creating a Cactus object...\n");

        Cactus cactus = new Cactus();
        System.out.println();

        Plant plant = new Cactus();
        System.out.println();

        Thing thing = new Cactus();
    }
}

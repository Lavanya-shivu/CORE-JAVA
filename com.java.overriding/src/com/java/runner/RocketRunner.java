package com.java.runner;

import com.java.external.Airconditioner.SpaceRocket;

public class RocketRunner {
    public static void main(String[] args) {
        SpaceRocket rocket = new SpaceRocket();
        rocket.launch();
        System.out.println("--------------------------");

        rocket.igniteEngines();
        rocket.orbit();
        rocket.orbit(rocket);
        rocket.orbit(null);
        System.out.println("==========================");
    }
}

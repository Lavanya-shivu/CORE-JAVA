package com.java.runner;

import com.java.external.BangaloreMetro;
import com.java.internal.rule.Metro;

public class MetroRunner {
    public static void main(String[] args) {
        Metro metro = new BangaloreMetro();

        metro.startJourney();

    }
}

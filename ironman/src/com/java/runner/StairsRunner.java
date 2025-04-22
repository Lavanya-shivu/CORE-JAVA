package com.java.runner;

import com.java.external.WoodenStairs;
import com.java.internal.rule.Stairs;

public class StairsRunner {
    public static void main(String[] args) {
        Stairs stairs = new WoodenStairs();
        stairs.numberOfSteps();
    }
}

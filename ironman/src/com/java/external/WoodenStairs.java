package com.java.external;

import com.java.internal.rule.Stairs;

public class WoodenStairs implements Stairs {
    @Override
    public void numberOfSteps(){
        System.out.println("Number of wooden steps");
    }
}

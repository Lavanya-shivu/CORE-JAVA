package com.java.gold;

import java.util.Objects;

public class Necklace {
    public Necklace(Gold gold) {
        System.out.println("Running constructor in Climate");
        if (Objects.nonNull(gold)) {
            gold.carrot();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void carrot() {
        System.out.println("Carrot is 24");
    }

}

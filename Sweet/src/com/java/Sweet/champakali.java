package com.java.Sweet;

import java.util.Objects;

public class champakali {
    public champakali(Sweet sweet) {
        System.out.println("Running constructor in champakali");
        if (Objects.nonNull(sweet)) {
            sweet.taste();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void taste() {
        System.out.println("Taste is good");
    }

}

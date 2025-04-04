package com.java.Cigratte;

import java.util.Objects;

public class Cancer {
    public Cancer(Cigratte cancer) {
        System.out.println("Running constructor in Climate");
        if (Objects.nonNull(cancer)) {
            cancer.injuries();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void injuries() {
        System.out.println("Cigratte leads to cancer");
    }
}

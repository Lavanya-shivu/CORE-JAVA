package com.java.BlackAndWhite;

import java.util.Objects;

public class Color {
    public Color(Color color) {
        System.out.println("Running constructor in Color");
        if (Objects.nonNull(color)) {
            color.heatabsorbtion();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void heatabsorbtion() {
        System.out.println("Heatabsorbtion color is Black");
    }

}

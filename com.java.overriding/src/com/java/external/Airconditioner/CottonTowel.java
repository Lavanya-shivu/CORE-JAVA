package com.java.external.Airconditioner;

import com.java.internal.Towel;

public class CottonTowel {
    public void cottonTowel(Towel towel) {
        if (towel != null) {
            if (towel instanceof BathTowel) {
                BathTowel bathTowel = (BathTowel) towel;
                bathTowel.fold();
                bathTowel.hang();
            } else {
                towel.dry();
                System.out.println("Towel is Cotton Towel");
            }
        } else {
            System.out.println("Towel is null");
        }
    }
}
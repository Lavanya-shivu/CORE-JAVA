package com.java.runner;

import com.java.external.Airconditioner.BathTowel;

public class TowelRunner {
    public static void main(String[] args) {
        BathTowel towel = new BathTowel();
        towel.dry();
        System.out.println("--------------------------");

        towel.fold();
        towel.hang();
        towel.hang(towel);
        towel.hang(null);
        System.out.println("==========================");
    }
}

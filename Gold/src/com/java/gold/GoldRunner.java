package com.java.gold;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold = new Gold();
        Necklace necklace = new Necklace(gold);
        necklace.carrot();
    }
}

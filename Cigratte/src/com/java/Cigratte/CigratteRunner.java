package com.java.Cigratte;

public class CigratteRunner {
    public static void main(String[] args) {
        Cigratte cigratte = new Cigratte();
        Cancer cancer = new Cancer(cigratte);
        cigratte.injuries();
    }
}

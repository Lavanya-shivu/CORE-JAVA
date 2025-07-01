package com.xworkz.guest;

import java.util.HashSet;
import java.util.Set;

public class HashSetContainsExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        boolean hasBanana = fruits.contains("Banana");

        System.out.println("HashSet:" + fruits);
        System.out.println("Contains 'Banana'?" + hasBanana);
    }
}

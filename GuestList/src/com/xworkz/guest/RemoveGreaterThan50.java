package com.xworkz.guest;

import java.util.ArrayList;

public class RemoveGreaterThan50 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(60);
        numbers.add(45);
        numbers.add(25);
        numbers.add(36);
        numbers.add(75);

        System.out.println("Original List:" + numbers);

        numbers.removeIf(n -> n > 50);

        System.out.println("After removing elements > 50:" + numbers);
    }
}

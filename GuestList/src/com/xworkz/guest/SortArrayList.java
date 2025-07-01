package com.xworkz.guest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Before Sorting:" + fruits);

        Collections.sort(fruits);

        System.out.println("After Sorting Alphabetically:" + fruits);
    }
}

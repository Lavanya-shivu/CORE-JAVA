package com.xworkz.guest;

import java.util.ArrayList;
import java.util.List;

public class ListSizeExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Html");
        languages.add("CSS");
        languages.add("Python");


        int size = languages.size();

        System.out.println("List: " + languages);
        System.out.println("Size of the list:" + size);
    }
}

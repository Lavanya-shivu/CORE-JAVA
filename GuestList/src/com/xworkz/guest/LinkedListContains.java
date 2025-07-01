package com.xworkz.guest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListContains {
    public static void main(String[] args) {

        List<String> message = new LinkedList<>();

        message.add("Hi");
        message.add("Hello");
        message.add("Good Morning");
        message.add("Good Night");

        System.out.println(message);

        boolean containsHello = message.contains("Hello");
        System.out.println(containsHello);
    }
}

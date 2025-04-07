package com.java.Property;

public class PropertyRunner {
    public static void main(String[] args) {
        Site site1 = new Site("BTM", 52016.02);
        Site site2 = new Site("Jaynag", 25633.0);

        Property property = new Property("BTM", 5251.0, new Site[]{site1, site2});
        property.display();
    }
}
    package com.java.internal;

    public class Bridge {
        private String material;
        private double length;

        // Default constructor
        public Bridge() {
        }

        // Constructor to initialize variables
        public Bridge(String material, double length) {
            this.material = material;
            this.length = length;
        }

        // Setter for material
        public void setMaterial(String material) {
            this.material = material;
        }

        // Setter for length
        public void setLength(double length) {
            this.length = length;
        }
        public void support() {
            System.out.println("Bridge supports the road and vehicles.");
        }
        @Override
        public String toString() {
            return "Bridge Material: " + material + ", Length: " + length + " meters";
        }
    }

package com.java.Property;

public class Property {
        private String location;
        private double price;
        private Site s[];

        public Property(String location, double price, Site s[]){
            this.location=location;
            this.price=price;
            this.s=s;
        }
        public void display(){
            System.out.println("location:"+location +"price:"+price);
        }
    }


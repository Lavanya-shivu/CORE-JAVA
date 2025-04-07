package com.java.Tickets;

public class Tickets {
    private String tickettype;
    private double price;
    private People p[];

    public Tickets(String tickettype, double price, People p[]){
        this.tickettype=tickettype;
        this.price=price;
        this.p=p;
    }
    public void display(){
        System.out.println("tickettype:"+tickettype +"price:"+price);
    }
}

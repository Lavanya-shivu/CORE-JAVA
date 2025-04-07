package com.java.Tickets;

public class TicketsRunner {
    public static void main(String[] args) {
        People people1 = new People("Lavanya", 'F');
        People people2 = new People("Krishna", 'M');

        Tickets tickets = new Tickets("bus", 1200, new People[]{people1, people2});
        tickets.display();
    }
}

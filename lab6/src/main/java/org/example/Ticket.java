package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;

    public Ticket(String event, int seatNumber,double price){
        this.event=event;
        this.seatNumber=seatNumber;
        this.price=price;
    }

    public String getEvent() {
        return event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount() {
        price = price * 0.9;
    }
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Концерт", 42, 1000.0);
        System.out.println("Событие: " + ticket.getEvent());
        System.out.println("Место: " + ticket.getSeatNumber());
        System.out.println("Цена до скидки: " + ticket.getPrice());

        ticket.applyDiscount();

        System.out.println("Цена после скидки: " + ticket.getPrice());
    }
}

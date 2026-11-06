package org.example;

public class Vehicle {
    private String brand;
    private int year;
    private double speed;

    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Транспорт движется");
    }

    public void move(int distance) {
        System.out.println("Транспорт проехал " + distance + " км");
    }

    public void move(String destination) {
        System.out.println("Транспорт едет в " + destination);
    }

    public double getSpeed() {
        return speed;
    }
}

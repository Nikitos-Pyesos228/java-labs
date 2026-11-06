package org.example;

public class Car extends Vehicle {
    public Car(String brand, int year, double speed) {
        super(brand, year, speed);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed() * 2.0;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль едет по дороге");
    }
}
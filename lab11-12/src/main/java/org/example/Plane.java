package org.example;

public class Plane extends Vehicle {
    public Plane(String brand, int year, double speed) {
        super(brand, year, speed);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed() * 2.0;
    }

    @Override
    public void move() {
        System.out.println("Самолет летит в небе");
    }
}

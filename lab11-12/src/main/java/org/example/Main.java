package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Общий", 2020, 60.0);
        v.move();
        v.move(100);
        v.move("Минск");

        Car car = new Car("BMW", 2022, 120.0);
        car.move();
        System.out.println("Скорость авто: " + car.getSpeed());

        Plane plane = new Plane("Boeing", 2021, 500.0);
        plane.move();
        System.out.println("Скорость самолета: " + plane.getSpeed());
    }
}
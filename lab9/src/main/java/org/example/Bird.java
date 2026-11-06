package org.example;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double weight, double wingSpan) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }

    @Override
    public void move() {
        System.out.println("Летает в небе");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размах крыльев: " + wingSpan);
    }
}
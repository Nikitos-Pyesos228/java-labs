package org.example.exe;

public class Bird extends Animal {
    private double wingspan;

    public Bird(String name, int id, int age, double wingspan) {
        super(name, id, age);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Размах крыльев: " + wingspan;
    }
}

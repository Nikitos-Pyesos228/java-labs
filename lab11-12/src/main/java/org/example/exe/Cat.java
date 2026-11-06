package org.example.exe;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int id, int age, String color) {
        super(name, id, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Цвет: " + color;
    }
}
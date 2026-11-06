package org.example;

public class Circle implements Drawable, Calculatable, Comparable {
    private String color;
    private double radius;
    private int x;
    private int y;

    public Circle(String color, double radius, int x, int y) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг с радиусом " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Calculatable) {
            Calculatable other = (Calculatable) o;
            return Double.compare(this.calculateArea(), other.calculateArea());
        }
        return 0;
    }
}
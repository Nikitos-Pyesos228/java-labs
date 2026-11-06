package org.example;

public class Rectangle implements Drawable, Calculatable, Comparable {
    private String color;
    private double width;
    private double height;
    private int x;
    private int y;

    public Rectangle(String color, double width, double height, int x, int y) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        System.out.println("Рисую прямоугольник " + width + "x" + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
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

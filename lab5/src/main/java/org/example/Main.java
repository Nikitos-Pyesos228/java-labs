package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(12.0, 4.0);

        System.out.println("Прямоугольник 1: ширина = " + rect1.getWidth() + ", высота = " + rect1.getHeight());
        System.out.println("Площадь: " + rect1.area() + ", Периметр: " + rect1.perimeter());

        System.out.println("Прямоугольник 2: ширина = " + rect2.getWidth() + ", высота = " + rect2.getHeight());
        System.out.println("Площадь: " + rect2.area() + ", Периметр: " + rect2.perimeter());
    }
}

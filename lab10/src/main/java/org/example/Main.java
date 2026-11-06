package org.example;

public class Main {
    public static void main(String[] args) {
        Calculatable[] shapes = new Calculatable[5];

        shapes[0] = new Circle("Красный", 5.0, 0, 0);
        shapes[1] = new Circle("Синий", 3.0, 1, 2);
        shapes[2] = new Circle("Зеленый", 4.5, 3, 3);
        shapes[3] = new Rectangle("Желтый", 4.0, 6.0, 0, 1);
        shapes[4] = new Rectangle("Белый", 2.0, 8.0, 5, 5);

        for (Calculatable shape : shapes) {
            System.out.println("Площадь: " + shape.calculateArea());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
абстрактный класс интерфейс и реализация в мейне
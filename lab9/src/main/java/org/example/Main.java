package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Бобик", 3, 12.5, "Овчарка");
        animals[1] = new Dog("Шарик", 5, 8.0, "Такса");
        animals[2] = new Bird("Кеша", 2, 0.3, 0.25);
        animals[3] = new Bird("Чижик", 1, 0.1, 0.15);
        animals[4] = new Bird("Гоша", 4, 0.5, 0.35);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }
}

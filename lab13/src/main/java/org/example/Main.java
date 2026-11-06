package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Product badProduct = new Product("гнилой банан", -15.0, 5, "фрукты");
        } catch (InvalidPriceException e){
            System.err.println("Ошибка при создании :"+ e.getMessage());
        }

        try {
            Product product = new Product("Ноутбук", 1000.0, 5, "Электроника");

            product.reduceQuantity(2);
            System.out.println("Остаток после покупки: " + product.getQuantity());

            product.increasePrice(10.0);
            System.out.println("Новая цена: " + product.getPrice());

            product.reduceQuantity(10);

        } catch (InvalidPriceException e) {
            System.out.println("Ошибка цены: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Ошибка склада: " + e.getMessage());
        }
    }
}
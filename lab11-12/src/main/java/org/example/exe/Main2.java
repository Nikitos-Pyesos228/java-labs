package org.example.exe;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        List<Integer> rev1 = new ArrayList<>();
        rev1.add(5); rev1.add(4); rev1.add(5);
        products.add(new Product(1, "Молоко", "Молочные продукты", 3, rev1));

        List<Integer> rev2 = new ArrayList<>();
        rev2.add(2); rev2.add(1); rev2.add(2);
        products.add(new Product(2, "Хлеб", "Выпечка", 2, rev2));

        List<Integer> rev3 = new ArrayList<>();
        rev3.add(5); rev3.add(5); rev3.add(4);
        products.add(new Product(3, "Сыр", "Молочные продукты", 4, rev3));

        List<Integer> rev4 = new ArrayList<>();
        rev4.add(4); rev4.add(4); rev4.add(4);
        products.add(new Product(4, "Яблоки", "Фрукты", 3, rev4));


        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getAverageRating() < 3.0) {
                products.remove(i);
                i--;
            }
        }


        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getAverageRating() >= 4.0) {
                p.setRating(p.getRating() + 1);
            }
        }

        System.out.println("--- Товары с рейтингом 4 ---");
        printProducts(products, 4);


        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = 0; j < products.size() - i - 1; j++) {
                Product p1 = products.get(j);
                Product p2 = products.get(j + 1);


                int comp = Double.compare(p2.getAverageRating(), p1.getAverageRating());
                if (comp == 0) {

                    comp = p1.getName().compareTo(p2.getName());
                }

                if (comp > 0) {
                    products.set(j, p2);
                    products.set(j + 1, p1);
                }
            }
        }

        System.out.println("\n--- Отсортированные товары ---");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println("ID: " + p.getId() + ", Название: " + p.getName() + ", Средний рейтинг: " + p.getAverageRating());
        }
    }

    public static void printProducts(List<Product> products, int rating) {
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getRating() == rating) {
                System.out.println(p);
            }
        }
    }
}
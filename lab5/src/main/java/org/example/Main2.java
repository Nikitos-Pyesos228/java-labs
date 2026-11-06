package org.example;

public class Main2 {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Война и мир", "Л. Толстой", 1869),
                new Book("Преступление и наказание", "Ф. Достоевский", 1866),
                new Book("Мастер и Маргарита", "М. Булгаков", 1967),
                new Book("Гарри Поттер", "Дж. Роулинг", 1997),
                new Book("Чистый код", "Р. Мартин", 2008)
        };

        Book oldest = books[0];
        Book newest = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getYear() < oldest.getYear()) {
                oldest = books[i];
            }
            if (books[i].getYear() > newest.getYear()) {
                newest = books[i];
            }
        }

        System.out.println("Самая старая книга: " + oldest.getTitle() + " (" + oldest.getYear() + " г.)");
        System.out.println("Самая новая книга: " + newest.getTitle() + " (" + newest.getYear() + " г.)");
    }
}

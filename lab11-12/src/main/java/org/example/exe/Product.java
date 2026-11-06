package org.example.exe;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private String category;
    private int rating;
    private List<Integer> customerReviews;

    public Product(int id, String name, String category, int rating, List<Integer> customerReviews) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.customerReviews = customerReviews;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getAverageRating() {
        if (customerReviews == null || customerReviews.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int score : customerReviews) {
            sum += score;
        }
        return (double) sum / customerReviews.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Средний рейтинг: " + getAverageRating();
    }
}
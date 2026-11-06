package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) throws InvalidPriceException {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Цена должна быть больше нуля");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным");
        }
        this.quantity = quantity;
    }

    public void reduceQuantity(int amount) throws OutOfStockException {
        if (amount > quantity) {
            throw new OutOfStockException("Недостаточно товара на складе");
        }
        this.quantity -= amount;
    }

    public void increasePrice(double percent) throws InvalidPriceException {
        if (percent <= 0) {
            throw new InvalidPriceException("Процент увеличения должен быть больше нуля");
        }
        setPrice(this.price + this.price * (percent / 100.0));
    }
}
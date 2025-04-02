package com.ct.abstract_2April_3;
// import java.util.Scanner;

public abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public abstract void applyDiscount(double percentage);
    public abstract double calculateTax();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty or null.");
        }
        this.name = name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be empty or null.");
        }
        this.category = category.trim();
    }

    @Override
    public String toString() {
        return "Product Name: " + name + "\nCategory: " + category + "\nPrice RS: " + price;
    }
}

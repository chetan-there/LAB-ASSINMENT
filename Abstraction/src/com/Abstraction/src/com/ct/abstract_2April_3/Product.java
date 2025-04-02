package com.ct.abstract_2April_3;

public abstract class Product {

    private String name;
    private double price;
    private String category;

    Product(String name,double price,String category)
    {
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public abstract void applyDiscount(double percentage);

    
    public abstract double calculateTax();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
    }

    
}

package com.ct.EH_Day8.ShoppingApppllication;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void decreaseQuantity(int amount) throws InsufficientQuantityException {
        if (amount > quantity) {
            throw new InsufficientQuantityException("Only " + quantity + " items available for " + name);
        }
        quantity -= amount;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

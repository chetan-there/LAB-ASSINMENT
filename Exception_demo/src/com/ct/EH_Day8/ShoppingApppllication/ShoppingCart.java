package com.ct.EH_Day8.ShoppingApppllication;

class ShoppingCart {
    private Product[] cartItems;
    private int itemCount;
    private int[] quantities; // To track quantities of each product in cart

    public ShoppingCart(int capacity) {
        cartItems = new Product[capacity];
        quantities = new int[capacity];
        itemCount = 0;
    }

    public void addToCart(Product product, int quantity)
            throws InsufficientQuantityException, InvalidProductException {
        if (product == null) {
            throw new InvalidProductException("Cannot add null product to cart");
        }
        if (itemCount >= cartItems.length) {
            throw new InvalidProductException("Cart is full (capacity: " + cartItems.length + ")");
        }

        // Check if product already exists in cart
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getId() == product.getId()) {
                product.decreaseQuantity(quantity);
                quantities[i] += quantity;
                return;
            }
        }

        // Add new product to cart
        product.decreaseQuantity(quantity);
        cartItems[itemCount] = product;
        quantities[itemCount] = quantity;
        itemCount++;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].getPrice() * quantities[i];
        }
        return total;
    }
}
package com.ct.equals_demo;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;

    // Parameterized constructor
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference check
        }
        if (obj == null || getClass() != obj.getClass()) {
            System.out.println("Cannot compare Product with a different type.");
            return false; // Ensure obj is of type Product
        }
        Product product = (Product) obj;
        return productId == product.productId && Objects.equals(productName, product.productName);
    }

    
    @Override // Override hashCode method to follow contract
    public int hashCode() {
        return Objects.hash(productId, productName);
    }
}
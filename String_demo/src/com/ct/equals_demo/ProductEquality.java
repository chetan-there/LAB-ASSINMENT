package com.ct.equals_demo;

public class ProductEquality {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop");
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Phone");

        System.out.println("Comparing p1 and p2: " + p1.equals(p2)); // True, same content
        System.out.println("Comparing p1 and p3: " + p1.equals(p3)); // False, different productId

        // Attempting to compare with a different class
        String someObject = "Not a Product";
        System.out.println("Comparing p1 and String object: " + p1.equals(someObject)); // False with a message
    }
}
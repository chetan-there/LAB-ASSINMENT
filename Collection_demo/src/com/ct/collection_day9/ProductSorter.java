package com.ct.collection_day9;

import java.util.*;

record Product(int pid, String pname) {
    public Product {
        if (pid <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Product{id=" + pid + ", name='" + pname + "'}";
    }
}

public class ProductSorter {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Mouse");
        Product p2 = new Product(202, "Keyboard");
        Product p3 = new Product(150, "Monitor");
        Product p4 = new Product(75, "CPU");
        Product p5 = new Product(130, "Speaker");

        // 1) Sort by pid ascending
        TreeSet<Product> byPidAsc = new TreeSet<>(Comparator.comparingInt(Product::pid));
        byPidAsc.addAll(List.of(p1, p2, p3, p4, p5));
        System.out.println("Sorted by pid (Ascending):");
        byPidAsc.forEach(System.out::println);

        // 2) Sort by pid descending
        TreeSet<Product> byPidDesc = new TreeSet<>(Comparator.comparingInt(Product::pid).reversed());
        byPidDesc.addAll(List.of(p1, p2, p3, p4, p5));
        System.out.println("\nSorted by pid (Descending):");
        byPidDesc.forEach(System.out::println);

        // 3) Sort by name alphabetically
        TreeSet<Product> byNameAsc = new TreeSet<>(Comparator.comparing(Product::pname));
        byNameAsc.addAll(List.of(p1, p2, p3, p4, p5));
        System.out.println("\nSorted by name (Alphabetical):");
        byNameAsc.forEach(System.out::println);

        // 4) Sort by name in reverse alphabetical order
        TreeSet<Product> byNameDesc = new TreeSet<>(Comparator.comparing(Product::pname).reversed());
        byNameDesc.addAll(List.of(p1, p2, p3, p4, p5));
        System.out.println("\nSorted by name (Reverse Alphabetical):");
        byNameDesc.forEach(System.out::println);
    }
}

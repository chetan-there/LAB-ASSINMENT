package com.ct.collection_day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101, "Pen", 100));
        products.add(new Product(102, "Pencil", 60));
        products.add(new Product(103, "book", 200));

        Collections.sort(products);
        System.out.println("Original Data :");
		products.forEach(System.out::println);




    }
}

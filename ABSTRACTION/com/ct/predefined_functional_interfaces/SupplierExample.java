package com.ct.predefined_functional_interfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
        Supplier<String> supplier = new Supplier<String>() {
            public String get() {
                return "Traditional: Hello!";
            }
        };
        */

        Supplier<String> supplier = () -> "Lambda: Hello!";

        System.out.println(supplier.get());
    }
}

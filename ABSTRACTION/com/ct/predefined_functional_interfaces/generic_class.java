
package com.ct.predefined_functional_interfaces;

public class generic_class {

    // Generic method with type parameter <T>
    public static <T> void display(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        display(100);         // Integer
        display("Generic");   // String
        display(12.34);       // Double
    }
}
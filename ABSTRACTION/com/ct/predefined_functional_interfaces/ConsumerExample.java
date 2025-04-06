package com.ct.predefined_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /*
        Consumer<String> printer = new Consumer<String>() {
            public void accept(String s) {
                System.out.println("Traditional: " + s);
            }
        };
        */

        Consumer<String> printer = s -> System.out.println("Lambda: " + s);

        printer.accept("Hello, Consumer!");
    }
}

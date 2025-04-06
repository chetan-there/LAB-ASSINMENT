package com.ct.predefined_functional_interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
        BiConsumer<String, Integer> show = new BiConsumer<String, Integer>() {
            public void accept(String name, Integer age) {
                System.out.println(name + " is " + age);
            }
        };
        */

        BiConsumer<String, Integer> show = (name, age) -> System.out.println(name + " is " + age);

        show.accept("Alice", 30);
    }
}

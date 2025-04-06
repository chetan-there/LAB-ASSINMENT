package com.ct.predefined_functional_interfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        /*
        ToIntFunction<String> lengthFunc = new ToIntFunction<String>() {
            public int applyAsInt(String s) {
                return s.length();
            }
        };
        */

        ToIntFunction<String> lengthFunc = s -> s.length();

        System.out.println("Length: " + lengthFunc.applyAsInt("Java"));
    }
}

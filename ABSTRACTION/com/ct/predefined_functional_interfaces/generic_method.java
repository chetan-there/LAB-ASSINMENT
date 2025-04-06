package com.ct.predefined_functional_interfaces;
// T is the type parameter
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class generic_method {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer Value: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello");
        System.out.println("String Value: " + strBox.getValue());
    }
}

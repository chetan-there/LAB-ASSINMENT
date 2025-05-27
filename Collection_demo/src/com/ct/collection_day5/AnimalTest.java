package com.ct.collection_day5;

import java.util.ArrayList;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }

    void displayInfo() {
        System.out.println("Animal: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Woof!");
    }

    @Override
    void displayInfo() {
        System.out.println("Animal: " + name + ", Age: " + age + ", Breed: " + breed);
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Meow!");
    }

    @Override
    void displayInfo() {
        System.out.println("Animal: " + name + ", Age: " + age + ", Color: " + color);
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Step 1: Create Animal list
        ArrayList<Animal> animals = new ArrayList<>();

        // Step 2: Add Dog and Cat objects
        animals.add(new Dog("Bella", 3, "Beagle"));
        animals.add(new Cat("Whiskers", 2, "White"));

        // Step 3: Loop and call methods
        for (Animal a : animals) {
            a.displayInfo();     // Polymorphic call
            a.makeSound();       // Polymorphic call
            System.out.println();
        }
    }
}

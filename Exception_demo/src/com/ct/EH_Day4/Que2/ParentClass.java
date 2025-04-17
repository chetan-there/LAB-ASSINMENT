package com.ct.EH_Day4.Que2;

public class ParentClass {

    // Method that throws checked exception
    public void loadingClass(String className) throws ClassNotFoundException {
        // Load the class using Class.forName
        Class<?> clazz = Class.forName(className);
        System.out.println("Class loaded successfully: " + clazz.getName());
    }
}

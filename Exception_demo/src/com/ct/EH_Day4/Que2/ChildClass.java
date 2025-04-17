package com.ct.EH_Day4.Que2;

public class ChildClass extends ParentClass {

    // Overriding method with added validation and exception conversion
    @Override
    public void loadingClass(String className) {
        try {
            if (className == null || className.isEmpty()) {
                throw new IllegalArgumentException("Class name cannot be empty");
            }

            // Call superclass method
            super.loadingClass(className);

        } catch (ClassNotFoundException e) {
            System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
            throw new RuntimeException("Unchecked Exception: RuntimeException from ChildClass");
        }
    }
}

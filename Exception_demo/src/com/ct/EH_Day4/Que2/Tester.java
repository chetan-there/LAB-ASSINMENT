package com.ct.EH_Day4.Que2;

public class Tester {
    public static void main(String[] args) {
        // Check if command line argument is given
        if (args.length == 0) {
            System.out.println("Please provide class name as command line argument.");
            return;
        }

        String className = args[0];

        ChildClass cc = new ChildClass();
        try {
            cc.loadingClass(className);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

package com.ct.EH_Day3;

import java.util.Scanner;

public class ClassNotFoundExpDemo {
    public ClassNotFoundExpDemo(String className) {
        try {
            Class<?> x = Class.forName(className);
            System.out.println("Class " + className + " class is found  : " + x);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name to load ");
        String cName = sc.next();
        new ClassNotFoundExpDemo(cName);
        sc.close();

    }
}

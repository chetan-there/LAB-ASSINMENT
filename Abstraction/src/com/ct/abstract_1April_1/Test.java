package com.ct.abstract_1April_1;

public class Test {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(30.3, 45.4);
        Circle circle = new Circle(23.2);
        Triangle triangle = new Triangle(146.2, 40.0);
        
        System.out.println("------------------------------------------");

        rectangle.printDetails();

        System.out.println("------------------------------------------");

        circle.printDetails();
        
        System.out.println("------------------------------------------");

        triangle.printDetails();
        // System.out.println(rectangle.getArea());
        // System.out.println(circle.getArea());
        // System.out.println(triangle.getArea());
       
    }
}
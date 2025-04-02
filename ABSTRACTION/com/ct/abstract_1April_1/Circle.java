package com.ct.abstract_1April_1;

public class Circle extends Shape {

    double radius;
    final double PI=3.14159265359;

    Circle(double radius){
        this.radius=radius;
    }
    double getArea() {
        return PI*radius*radius;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Circle \n"+"radius = "+radius+"\nArea ="+getArea());
        }


}
package com.ct.abstract_1April_1;

public class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length ,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    double getArea() {
        return length*breadth;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Rectangle \n"+"Length = "+length+"\nBreadth = "+breadth+"\nArea ="+getArea());
        }
}
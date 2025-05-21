package com.ct.abstraction_day1;

public class Triangle extends Shape {

    double base;
    double height;

    Triangle( double base,double height){
        this.base=base;
        this.height=height;
    }

    double getArea() {
        return 0.5*base*height;
    }

    @Override
    void printDetails() {
        System.out.println("Type = Triangle \n"+"base = "+base+"\nHeight = "+height+"\nArea ="+getArea());
        }

}



package com.ct.EH_Day3;

import java.util.Scanner;

public class AreaCalculator {
    
    public static double calculateArea(double length ,double width){
        if(length > 0 && width > 0){
        return length*width ;        
        }
        else throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double a=sc.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double b=sc.nextDouble();

        try {
            calculateArea(a,b);
            System.out.println(calculateArea(a,b));
        }catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Dimensions must be positive: length="+a+", width="+b);
        }
    }

   


}

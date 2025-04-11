package com.ct.lambda.lambda_day1;

import java.util.Scanner;
import java.util.function.*;

public class ValueModifier {

    

    public static void main(String[] args) {
        
         Consumer<String> stringConsumer = s -> System.out.println("After converting string to uppercase: "+s.toUpperCase());;
         Consumer<Integer> integerConsumer = n -> System.out.println("After squaring the integer: "+n*n);
         
        // printer.accept("Hello, Consumer!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert into Uppercase");
        String str=scanner.nextLine();
        System.out.println("Enter a number to convert into square");
        Integer num=scanner.nextInt();

        System.out.println("Orignal String"+str);
        System.out.println("Orignal Integer"+num);

        System.out.println("===================================================");
        

        stringConsumer.accept(str); 
        integerConsumer.accept(num);

        scanner.close();

    }

}

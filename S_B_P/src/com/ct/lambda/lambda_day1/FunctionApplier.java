package com.ct.lambda.lambda_day1;

import java.util.Scanner;
import java.util.function.*;

public class FunctionApplier {
    public static void main(String[] args) {
        
        Function<String , Integer > getStringLength = str -> str.length();
        Function<Integer, Double> divideAndFormat = num -> num / 2.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        System.out.println("String testString = ");
        String str = scanner.nextLine();
        System.out.println(" int testInteger = ");
        Integer Num =scanner.nextInt();

        System.out.println("+================+================+");

        System.out.println("Output");
        System.out.println("String length of "+str+": "+getStringLength.apply(str));
        System.out.println("Result of dividing "+Num+" by 2: "+divideAndFormat.apply(Num));

        System.out.println("+================+================+");
        scanner.close();
        }
        
    }
    
        // Function<Integer, String> converter = i -> "Lambda: " + (i * 2);

        // System.out.println(converter.apply(5));
        // Test
        // System.out.println("Divided result: " + divideAndFormat.apply(7)); // Output: 3.5
// }























// int input = 10; // Example input
// double result = input / 2.0; // Division by 2.0 to get a double result
// System.out.println("Formatted Result: " + String.format("%.2f", result)); // Optional formatting to 2 decimal places


// String inputStr = "Hello123"; // Example input
// int length = inputStr.length(); // Computes length of the string
// System.out.println("Length of the input string: " + length);

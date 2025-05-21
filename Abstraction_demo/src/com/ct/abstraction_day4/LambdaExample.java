package com.ct.abstraction_day4;

// Functional interface with different data types
interface IntOperation {
    int operate(int a);
}

interface FloatOperation {
    float operate(float a);
}

interface DoubleOperation {
    double operate(double a);
}

interface BooleanOperation {
    boolean operate(boolean a);
}

interface StringOperation {
    String operate(String s);
}

// Multi-argument functional interfaces
interface IntAdd {
    int add(int a, int b);
}

interface StringConcat {
    String concat(String a, String b);
}

public class LambdaExample {
    public static void main(String[] args) {

        // ---------- INT ----------
        // Traditional Way
        // IntOperation intOp = new IntOperation() {
        //     public int operate(int a) {
        //         return a * a;
        //     }
        // };

        // Lambda Way
        IntOperation intOp = a -> a * a;
        System.out.println("Square of 5: " + intOp.operate(5)); // Output: 25

        // ---------- FLOAT ----------
        FloatOperation floatOp = f -> f + 3.5f;
        System.out.println("Float calc: " + floatOp.operate(6.5f)); // Output: 10.0

        // ---------- DOUBLE ----------
        DoubleOperation doubleOp = d -> d / 2.0;
        System.out.println("Double calc: " + doubleOp.operate(8.0)); // Output: 4.0

        // ---------- BOOLEAN ----------
        BooleanOperation boolOp = b -> !b;
        System.out.println("Negation of true: " + boolOp.operate(true)); // Output: false

        // ---------- STRING ----------
        StringOperation stringOp = s -> s.toUpperCase();
        System.out.println("Uppercase: " + stringOp.operate("lambda")); // Output: LAMBDA

        // ---------- MULTI-ARG INT ----------
        IntAdd sum = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + sum.add(10, 20)); // Output: 30

        // ---------- MULTI-ARG STRING ----------
        StringConcat sc = (a, b) -> a + " " + b;
        System.out.println("Concatenation: " + sc.concat("Hello", "World")); // Output: Hello World
    }
}

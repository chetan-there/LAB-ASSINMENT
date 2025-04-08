package com.ct.lambda_ecpression_4april;

// Lambda Expressions

// interface Car {

//     public void BMW();
// }
// public class Main{
// public static void main(String[] args) {  // rv= referance variable 
//     Car rv =/* public void BMW */ (/* parameters */) -> /*this is method body it can contains return */ System.err.println("bmw method");
//     rv.BMW();
// }
// }

// Functional Interfaces

@FunctionalInterface /* this is anotation which is use for ristrict the interface to write more than one abstract method */
interface Car {
    public void maruti();
    
}
public class Main {
    public static void main(String[] args) {
        Car c= () -> System.err.println("hello i am maruti");
     /*classname referancevariable = method without name it is anonymous mehtod -> // lambda then println . */
        c.maruti();
    }
    
}



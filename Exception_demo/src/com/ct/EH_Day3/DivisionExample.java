package com.ct.EH_Day3;

import java.util.Scanner;

public class DivisionExample{
    
    public static int performDivision(int dividend,int divisor){
        return dividend/divisor;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int a=sc.nextInt();
        System.out.print("Enter divisor : ");
        int b=sc.nextInt();

        try{
            DivisionExample.performDivision(a, b);
            System.out.println("Result of division:"+performDivision(a, b));
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught: Division by zero: "+": dividend= "+a+" , divisor= "+b);
        }
        finally{
            sc.close();
        }



    }




}

package com.ct.EH_day2;

import java.util.Scanner;

public class DivisionExample {
	
	
	public static int performDivision(int dividend,int divisor)
	{
		return dividend/divisor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend : ");
		int a = sc.nextInt();		
		System.out.println("Enter divisor : ");
		int b = sc.nextInt();		
		
		
		try {
			performDivision(a,b);
			System.out.println("Result of division: "+performDivision(a, b));
			}
		catch(Exception e){
			System.out.println("ArithmeticException caught: "+e.getMessage()+": dividend= "+a+", divisor= "+b);
			}
		sc.close();
		}
}
s
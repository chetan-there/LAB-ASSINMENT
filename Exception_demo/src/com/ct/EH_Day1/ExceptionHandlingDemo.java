package com.ct.EH_Day1;

import java.util.Scanner;



public class ExceptionHandlingDemo {

	public static void handleExceptions(String str) {

		
		try {
			int length_str = Integer.parseInt(str);
			System.out.println("Length of the input string: "+length_str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to convert to an integer: ");
		String str=scanner.nextLine();
		ExceptionHandlingDemo.handleExceptions(str);
	
//		System.out.println("Length of the input string: "+length_str);
		
;	}

}

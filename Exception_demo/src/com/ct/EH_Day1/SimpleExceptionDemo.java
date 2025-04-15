package com.ct.EH_day1;

import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args)
	{				
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the value of a :");
				int x = sc.nextInt();
				
				System.out.print("Enter the value of b :");
				int y = sc.nextInt();
				
			}
			catch(Exception e)
			{
				System.out.println(e+"null");
				e.printStackTrace();
			}			

	}
}
	
	

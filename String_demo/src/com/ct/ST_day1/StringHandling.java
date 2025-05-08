package com.ct.ST_day1;
public class StringHandling {
	public static void main(String[] args) 
	{
		String str = "apple,banana,orange";
                String[] fruits = str.split("a");
                System.out.println(fruits[5]);
				System.out.println(fruits.length);
	}
}
package com.ct.EH_Day5;

class  Test
{
	public static void main(String[] args) 
	{
	    Exception e1 = new ArithmeticException("Number is divided by zero");
		System.out.println(e1);

         Exception e2 = new ArrayIndexOutOfBoundsException("Array is out of limit");
		System.out.println(e2);
	}
}
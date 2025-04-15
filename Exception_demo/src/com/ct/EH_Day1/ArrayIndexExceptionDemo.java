package com.ct.EH_Day1;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try {
		int a[] = new int[2];
		System.out.println(a[3]);
		}
		catch(Exception e){
			System.out.println("An ArrayIndexOutOfBoundsException ocurred.");
			System.out.println("Message: "+e.getMessage());
			System.out.println("String representation: "+e.toString());
			System.out.print("Stack trace: ");
			e.printStackTrace();
		}
	}

}

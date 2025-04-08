package com.ct.MCQ;

interface NIT
{
	String myInterface(String a);
}
public class Java8 {
	
	public static void main(String[] args) {
		
		//without parameter
		NIT nit = information -> System.out.println("Welcome to " + information);
		nit.myInterface("NIT");
	}
}
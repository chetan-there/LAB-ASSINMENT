package com.ct.MCQ;

interface Calculate
{
	int myinterface(int a, int b);
}

interface NIT
{
	String myInterface(String a);
}
public class Java8 {
	public static void main(String[] args) {
		Calculate cal = (a) -> a+5;
		cal.myinterface(1, 5);
		NIT nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
	}
}  

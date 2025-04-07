package com.ct.predefined_functional_interfaces;

@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
		NIT nit = (String name) -> {
			return name;
		};
		
		NIT nit1 = (String name) -> name;
		
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
	}
}
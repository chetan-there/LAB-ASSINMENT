package com.ct.predefined_functional_interfaces;

@FunctionalInterface
interface NIT
{
	String str(String nit);
}
public class FunctionalInterfaceExample
{
	public static void main(String[] args) {
	NIT nit = (String n) -> n +"ab";
	System.out.println(nit.str("hello"));
	}
}
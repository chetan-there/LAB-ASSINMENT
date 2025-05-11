package com.ct.Array_day1;

import java.util.Arrays;

public class ArrayRetrieval {

	public static void main(String[] args) {
		int[] x = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println("By using Ordinary for loop");

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		System.out.println("By using  loop each loop");
		int[] y = new int[] { 100, 200, 300 };

		for (int a : y) {
			System.out.println(a);
		}

		System.out.println("By using  toString() method");

		int[] z = { 1000, 2000, 3000 };
		System.out.println(Arrays.toString(z));

	}

}
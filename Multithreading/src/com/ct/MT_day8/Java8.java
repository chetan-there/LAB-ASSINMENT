package com.ct.MT_day8;

public class Java8 extends Thread {

	public void run() {
		for (int a = 0; a < 5; a++) {
			System.out.println("display");
		}
	}

	public void display1() {
		for (int a = 0; a < 5; a++) {
			System.out.println("display1");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Java8 java = new Java8();
		java.start();
		java.run();
		java.wait();
		java.display1();
	}
}
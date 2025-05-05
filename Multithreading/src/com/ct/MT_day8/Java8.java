package com.ct.MT_day8;

class TestSync {
	public static synchronized void display(String name) {
		System.out.println("Congratulations Mr/Mrs " + name);
	}
}

class NIT extends Thread {

	TestSync test;
	String name;

	@Override
	public void run() {
		test.display(name);
	}

	public NIT(TestSync test, String name) {
		this.test = test;
		this.name = name;
	}
}

public class Java8 {

	public static void main(String[] args) throws InterruptedException {
		TestSync test = new TestSync();
		NIT nit = new NIT(test, "Naresh");
		NIT nit1 = new NIT(test, "Ravi");
		nit.start();
		nit1.start();
	}
}
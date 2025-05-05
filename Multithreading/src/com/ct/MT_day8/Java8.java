package com.ct.MT_day8;

class NIT extends Thread {
	@Override
	public void run() {
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getName());
	}
}

public class Java8 {

	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();
		nit.start();
		nit1.start();
		nit2.start();
	}
}
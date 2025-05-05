package com.ct.MT_day8;

class NIT extends Thread {
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Java8 {

	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();

		nit.setPriority(Thread.MIN_PRIORITY);
		nit1.setPriority(Thread.MIN_PRIORITY);
		nit2.setPriority(Thread.MIN_PRIORITY);

		nit.start();
		nit1.start();
		nit2.start();
	}
}
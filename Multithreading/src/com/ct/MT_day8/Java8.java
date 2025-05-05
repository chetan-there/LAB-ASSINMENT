package com.ct.MT_day8;

class NIT extends Thread {
	@Override
	public void run() {
		for (int a = 0; a < 5; a++) {
			System.out.println("NIT Display");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class NIT1 extends Thread {
	@Override
	public void run() {
		for (int a = 0; a < 5; a++) {
			System.out.println("NIT Display1");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Java8 {

	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT1 nit1 = new NIT1();

		nit.start();
		nit.join();
		nit1.start();
		
	}
}
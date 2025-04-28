package com.ct.MT_Day3;

public class Test implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Test());
		thread.start();
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}
	@Override
	public void run() {
		System.out.println("NareshIT");
	}
}
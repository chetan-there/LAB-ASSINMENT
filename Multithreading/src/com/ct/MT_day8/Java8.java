package com.ct.MT_day8;

class NIT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		nit.run();
    }
}
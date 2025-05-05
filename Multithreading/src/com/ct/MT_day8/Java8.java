package com.ct.MT_day8;

public class Java8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT nit1 = new NIT();
		NIT nit2 = new NIT();
		NIT nit3 = new NIT();
		
		nit.start();
		nit.setPriority(Thread.NORM_PRIORITY);
		nit1.start();
		nit.setPriority(Thread.MIN_PRIORITY);
		nit2.start();
		nit.setPriority(Thread.MAX_PRIORITY);
		nit3.start();
		
    }
}
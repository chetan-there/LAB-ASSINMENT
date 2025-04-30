package com.ct.MT_Day5;

class Exam {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
					System.out.println("Waiting for Response");
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                lock.notify();
				System.out.println("Sending Notification");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
		System.out.println("Completed");
    }
}
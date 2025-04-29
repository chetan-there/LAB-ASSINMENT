// package com.ct.MT_Day4.OLA;

public class OLACabByExtendingAnonymousInnerClass {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("User requested a ride...");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Searching for nearby drivers...");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Driver found and assigned!");
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Calculating estimated fare...");
                    Thread.sleep(1500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Estimated fare: 135.75 RS.");
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 20; i <= 100; i++) {
                        if (i % 20 == 0) {
                            System.out.println("Updating ride location... " + i + "% completed");
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Ride Completed");
            }
        };

        Thread t5 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Processing payment...");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Payment successful!");
            }
        };

        Thread t6 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Requesting user rating...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("User rated the ride: 5 star");
            }
        };
        try {
            t1.start();
            t1.join();
            t3.start();
            t2.start();
            t2.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
            t6.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
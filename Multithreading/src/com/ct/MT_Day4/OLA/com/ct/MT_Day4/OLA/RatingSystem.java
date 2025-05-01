package com.ct.MT_Day4.OLA;

class RatingSystem extends Thread {
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
}
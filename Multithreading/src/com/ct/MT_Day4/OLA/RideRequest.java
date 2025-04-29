package com.ct.MT_Day4.OLA;

class RideRequest extends Thread {
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
}

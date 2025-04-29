package com.ct.MT_Day4.OLA;

class LiveTracking extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 20; i <= 100; i += 20) {
                System.out.println("Updating ride location... " + i + "% completed");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ride Completed");
    }
}
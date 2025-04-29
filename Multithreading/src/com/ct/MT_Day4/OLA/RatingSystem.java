package com.ct.MT_Day4.OLA;

public class RatingSystem extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Requesting user rating...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

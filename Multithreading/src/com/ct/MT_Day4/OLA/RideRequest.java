package com.ct.MT_Day4.OLA;

public class RideRequest extends Thread{
    @Override
    public void run() {
        super.run();
        try {
           System.out.println("User requested a ride.... User should wait for 2 seconds"); 
           System.out.println("Searching for nearby drivers...");
           
        } catch (Exception e) {
            
        }
    }
}

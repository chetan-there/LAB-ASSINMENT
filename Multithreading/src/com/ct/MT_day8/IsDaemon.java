package com.ct.MT_day8;


public class IsDaemon
{
  public static void main(String [] args)
   {
      Thread t = Thread.currentThread();
      t.setDaemon(true);
   }
}

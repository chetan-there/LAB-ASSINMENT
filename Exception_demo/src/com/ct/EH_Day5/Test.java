package com.ct.EH_Day5;

public class Test 
{
public static void main(String[] args) 
{
   try {
       throw new java.io.IOException();
   } 
     catch (java.io.IOException exc) {
       System.err.println("In catch IOException: "+exc.getClass());
       throw new RuntimeException();
   }
     catch (Exception exc) {
       System.err.println("In catch Exception: "+exc.getClass());
   }
     finally {
       System.err.println("In finally");
   }
}
}
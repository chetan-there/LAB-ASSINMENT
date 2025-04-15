package com.ct.EH_day2;

public class a87 {
	  public static void main(String[] argv) {
	    try 
		{
	      throw new OutOfMemoryError();
	      
	    }
		catch (Exception e)
		{
	      System.out.println("General exception");
	    } 
		finally 
		{
	      System.out.println("Doing finally part");
	    }
	    System.out.println("Carrying on");

	  }
	}
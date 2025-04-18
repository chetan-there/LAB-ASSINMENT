package com.ct.EH_Day5;

public class Test
{
	public static void main(String [] args)
	{
		String test="no";
		try
		{
			System.out.println("Start try");
			doRisky(test);
			System.out.println("End try");
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("End of main");
	}
	static void doRisky(String test) throws Exception
	{
		System.out.println("Start risky");
		if("yes".equals(test))
		{
			throw new Exception();
		}
		System.out.println("End Risky");
		return;
	}
}

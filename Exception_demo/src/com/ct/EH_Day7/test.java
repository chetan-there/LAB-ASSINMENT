package com.ct.EH_Day7;

class Student{    
	void message() throws Exception{  // line 1
		System.out.println("Hai Student");  
		}    
	}    
class Faculty extends Student{    
	void message()throws Exception {  // line 2
		System.out.println("hai faculty");  
		}
}

public class test 
{
	public static void main(String args[]) {    
	   Student nit = new Faculty();    
	     
	   try {    
	   nit.message();    
	   }  
	   catch (Exception e){}   
	  
	  }    
}

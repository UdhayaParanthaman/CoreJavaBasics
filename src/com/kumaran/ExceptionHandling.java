package com.kumaran;


//To recover error by adding extra codes
public class ExceptionHandling {

	public static void main(String[] args) {
	
		int a=187,b=0,c;
		
//		c=a/b;
//		System.out.println(c);
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Executed successfully");
		}
	}

}

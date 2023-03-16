package com.kumaran;


//To recover error by adding extra codes
public class ExceptionHandling2 {

	public static void main(String[] args) {
	
		int a=187,b=0,c;
		
//		c=a/b;
//		System.out.println(c);
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occured");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}

	}

}

package com.kumaran;

import com.kumaran.MethodOverriding.Addition;

//same method name and same arguments/parameters
public  class MethodOverriding {
	
	int a=10,b=13;
	public void add()
	{
		int c=a+b;
		System.out.println("Addition of a and b is: " +c);
	}
public static class Addition extends MethodOverriding{
	
	public void add()
	{
		int e=b;
		System.out.println("add " +e);
	}
}
	public static void main(String[] args) {

		
		Addition m=new Addition();
		m.add();
		
		
	
	}

}

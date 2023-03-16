package com.kumaran;

//same constructor name but different argument/parameters
public class ConstructorOverloading {

	public ConstructorOverloading()
	{
		
	}
	
	public ConstructorOverloading(String name)
	{
		System.out.println(name);
	}
	
	public ConstructorOverloading(String name,int dob)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

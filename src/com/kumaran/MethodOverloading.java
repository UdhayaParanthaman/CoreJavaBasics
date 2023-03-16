package com.kumaran;


//same method name but different arguments/parameters
public class MethodOverloading {
	
	int a=10,b=13,c=8,d;
	public void add()
	{
		int c=a+b;
		System.out.println("Addition of a and b is: " +c);
	}

	public void add(int b,int c)
	{
		int e=b+c;
		System.out.println("add " +e);
	}
	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(121,13);
	}

}

package com.kumaran;

 abstract class Udhaya
{
	public void smart() 
	{
		System.out.println("Smart");
	}
	
	public abstract void run();
}

public class  AbstractSample extends Udhaya {
	
	
	public void run() {
		
	}
	
	
	public void play()
	{
		System.out.println("Swimming");
	}

	public static void main(String[] args) {
		Udhaya u=new AbstractSample();
		u.smart();
		
	
	}

	



}

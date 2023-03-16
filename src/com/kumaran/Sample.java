package com.kumaran;

 interface Demo {
	public void send();
}

 interface Demo2 extends Demo{
	 public void send();
 }

public class Sample implements Demo {
	@Override
	public void send() {
		System.out.println("Hello World!!");
		
	}

public static void main(String[] args) {
	
	Sample s=new Sample();
	s.send();
}


}

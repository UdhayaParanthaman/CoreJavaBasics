package com.kumaran;


class A
{
	void read()
	{
		System.out.println("A is reading");
	}
}

class B extends A
{
	void read()
	{
		System.out.println("B is reading");
	}
}

//public class DiamondProblem extends B,A{
//
//	public static void main(String[] args) {
//
//		DiamondProblem dp=new DiamondProblem();
//		dp.read(); // creates ambiguity whether A class read is exceuted or B class read is executed
//	}
//
//}

  // diamond problem will be achieve in interface

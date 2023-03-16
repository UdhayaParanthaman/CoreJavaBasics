package com.kumaran;

class UdhayaKumar {
	void eat() {
		System.out.println("eating");
	}
}

class Saravana extends UdhayaKumar {
	void eat() {
		super.eat(); // super keyword -> to create implicitly object
		System.out.println("Burger eating");
	}
}

public class SuperKey extends Object { // for every class Object as a superclass

	public static void main(String[] args) {

		Saravana s = new Saravana();
		s.eat();
	}

}

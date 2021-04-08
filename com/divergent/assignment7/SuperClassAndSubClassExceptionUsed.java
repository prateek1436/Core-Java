package com.divergent.assignment7;

class SuperClass {
	void show() {
		System.out.println("Super Class");
	}
}

class SubClass extends SuperClass {
	void show() throws ArithmeticException {
		System.out.println("Sub Class");
	}
}

/**
 * Super class and sub class exception occured check
 * 
 * @author Divergent
 *
 */
public class SuperClassAndSubClassExceptionUsed {

	public static void main(String[] args) {
		SuperClass class1 = new SubClass();
		class1.show();
	}

}

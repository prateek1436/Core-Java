package com.divergent.assignment7;

class SuperClass1 {
	void show() throws Exception {
		System.out.println("Super Class");
	}
}

class SubClass1 extends SuperClass1 {
	void show() throws ArithmeticException {
		System.out.println("Sub Class");
	}
}

/**
 * In which we can Used Hierarchy of Exception 
 * @author Divergent
 *
 */
public class SuperClassAndSubClassExceptionUsed1 {

	public static void main(String[] args) throws Exception {
		SuperClass1 class1 = new SubClass1();
		class1.show();
	}

}

package com.divergent.task.assignment4;

/**
 * Ab Interface For Default Method
 * 
 * @author Divergent
 *
 */
interface Ab {

	/**
	 * Default Method
	 */
	default public void show() {
		System.out.println("Interface A");
	}
}

/**
 * Interface B With Mathod Show
 * 
 * @author Divergent
 *
 */
interface B {

	/**
	 * Default Method
	 */
	default public void show() {
		System.out.println("Interface B");
	}
}

/**
 * DefaultInMultipleInheritance class implements Ab and B Interface
 * 
 * @author Divergent
 *
 */
public class DefaultInMultipleInheritance implements Ab, B {

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultInMultipleInheritance defaultInMultipleInheritance = new DefaultInMultipleInheritance();
		defaultInMultipleInheritance.show();
	}

	/**
	 * Default Method Object By Super Keyword
	 */
	@Override
	public void show() {
		Ab.super.show();
		B.super.show();
	}
}

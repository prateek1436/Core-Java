package com.divergent.task.assigment4;

interface A {

	/**
	 * Default Method
	 */
	default public void show() {
		System.out.println("Default Method");
		sqare();
	}

	/**
	 * Private Method Square
	 */
	private void sqare() {
		System.out.println("Sqaure " + Math.sqrt(12));
	}
}

/**
 * DefaultMethodImplement Class and Implement Interface A
 * 
 * @author Divergent
 *
 */
public class DefaultMethodImplement implements A {

	public static void main(String[] args) {
		DefaultMethodImplement defaultMethodImplement = new DefaultMethodImplement();
		defaultMethodImplement.show();
	}
}

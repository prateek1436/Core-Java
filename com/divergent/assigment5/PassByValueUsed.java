package com.divergent.assigment5;

/**
 * Pass By Value Class 
 * @author Divergent
 *
 */
public class PassByValueUsed {

	int a = 50;

	/**
	 * change() method
	 * @param a
	 */
	void change(int a) {
		a = a + 100;
	}

	public static void main(String[] args) {
		PassByValueUsed passByValueUsed = new PassByValueUsed();

		System.out.println("before change " + passByValueUsed.a);
		passByValueUsed.change(500);
		System.out.println("after change " + passByValueUsed.a);

	}

}

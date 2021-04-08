package com.divergent.assignment7;

/**
 * Multiple Exception are Used
 * 
 * @author Divergent
 *
 */
public class MultipleCatchExceptionUsed {

	public static void main(String[] args) {
		try {
			int a = 25 / 0;
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

}

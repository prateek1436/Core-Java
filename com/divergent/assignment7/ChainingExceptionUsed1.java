package com.divergent.assignment7;

/**
 * Chaining Exception for NumberFromatException
 * 
 * @author Divergent
 *
 */
public class ChainingExceptionUsed1 {

	public static void main(String[] args) {
		try {
			NumberFormatException e = new NumberFormatException("Exception");
			e.initCause(new NumberFormatException("This is Chaining Exception"));
			throw e;
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}

}

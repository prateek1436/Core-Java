package com.divergent.assignment7;

import java.io.IOException;

/**
 * Chaining Exception
 * 
 * @author Divergent
 *
 */
public class ChainingExceptionUsed2 {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Top Level Exception.").initCause(new IOException("IO cause."));
		} catch (ArithmeticException ae) {
			System.out.println("Caught : " + ae);
			System.out.println("Actual cause: " + ae.getCause());
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}

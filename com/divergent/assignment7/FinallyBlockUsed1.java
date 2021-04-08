package com.divergent.assignment7;

/**
 * Finally Block Used
 * 
 * @author Divergent
 *
 */
public class FinallyBlockUsed1 {

	public static void main(String[] args) {
		try {
			int a = 25 / 0;
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("That is Finally Block it always excecuted");
			System.out.println("Run Rest of Code");
		}

	}

}

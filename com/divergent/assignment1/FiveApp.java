package com.divergent.assignment1;

import javax.sound.sampled.ReverbType;

/**
 * Reverse the letters of each word and a program that reverses the letters of
 * each word and the words themselves.
 * 
 * @author Prateek
 *
 */
public class FiveApp {

	/**
	 * String reverse by without method
	 * 
	 * @param text1
	 * @return
	 */
	public static String reverseWordCharacters(String text1) {
		String reverse = "";
		int length = text1.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + text1.charAt(i);
			System.out.println();
		}
		return reverse;
	}

	/**
	 * String reverse by method used reverse().
	 * 
	 * @param str
	 */
	public static void reverseWordByMethod(String str) {
		StringBuffer strB = new StringBuffer(str);
		strB.reverse();
		System.out.println(strB);
	}

	public static void main(String[] args) {
		String stringReverse = "Hello Prateek";
		System.out.println("Reversing Word are: " + reverseWordCharacters(stringReverse));
		reverseWordByMethod(stringReverse);
	}
}

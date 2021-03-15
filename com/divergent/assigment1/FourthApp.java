package com.divergent.assigment1;

/**
 * Write a program that returns the first non-repeated character from a given
 * string.
 * 
 * @author Prateek
 *
 */

public class FourthApp {

	/**
	 * first non repeating character in string
	 * 
	 * @param input
	 * @return
	 */
	public static char findFirstNonRepChar(String input) {
		char currentChar = '\0';
		int len = input.length();
		for (int i = 0; i < len; i++) {
			currentChar = input.charAt(i);
			if ((i != 0) && (currentChar != input.charAt(i - 1)) && (i == input.lastIndexOf(currentChar))) {
				return currentChar;
			}
		}
		return currentChar;
	}

	public static void main(String[] args) {
		System.out
				.println("Non-Repeated Character of String is : " + findFirstNonRepChar("Ram is Ram And Shyam is Ram"));
	}

}

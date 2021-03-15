package com.divergent.assigment2;

/**
 * Write a program that checks whether the given string contains the given
 * substring.
 * 
 * @author Prateek
 *
 */
public class StringContainIntoSubString {

	/**
	 * In this method we have two string, First string is str,second string is
	 * substring substr
	 * 
	 * @param str
	 * @param substr
	 */
	public static void matchFoundInString(String str, String substr) {
		String match = null;
		for (int i = 0; i <= str.length() - substr.length(); i++) {
			match = str.substring(i, i + substr.length());

			if (match.equals(substr)) {
				System.out.println(match);
			}
		}
		System.out.println("No Match Found!");
	}

	public static void main(String[] args) {
		String str = "HelloPrateek Patel";
		String substr = "Pratek P";
		matchFoundInString(str, substr);
	}
}

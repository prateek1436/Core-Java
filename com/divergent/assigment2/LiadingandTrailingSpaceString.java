package com.divergent.assigment2;

/**
 * Write a program that removes the leading and trailing spaces of the given
 * string.
 * 
 * @author Prateek
 *
 */
public class LiadingandTrailingSpaceString {

	/**
	 * In leading and trailing space of the given String by trim() method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "    Hello Trim    ";
		System.out.println("Without Triming : " + str);
		String strtrim = str.trim();
		System.out.println("With Triming : " + strtrim);
	}

}

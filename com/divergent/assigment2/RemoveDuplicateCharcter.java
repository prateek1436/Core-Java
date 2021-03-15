package com.divergent.assigment2;

import java.util.Scanner;

/**
 * Write a program that removes the given character from the given string.
 * 
 * @author Prateek
 *
 */
public class RemoveDuplicateCharcter {

	/**
	 * In below method have String and character by user to remove in a string
	 * 
	 * @param str
	 * @param ch
	 * @return
	 */
	public static String removeGivenCharacter(String str, char ch) {

		String s = "";
		char c[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (c[i] == ch) {
				continue;
			} else {
				s += c[i];
			}
		}
		return s;
	}

	/**
	 * In a below method string and integer value gave to remove given string
	 * 
	 * @param str
	 * @param p
	 * @return
	 */
	public static String charRemoveAt(String str, int c) {
		return str.substring(0, c) + str.substring(c + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		char c = sc.nextLine().charAt(0);
		String str = sc.next();
		System.out.println(removeGivenCharacter(str, c));
		System.out.println(charRemoveAt(str, 5));
	}

}

package com.divergent.assigment1;

/**
 * Search number in String
 * 
 * @author Prateek
 *
 */
public class SevenApp {

	/**
	 * Method Used For Find Digit and Character Present in String
	 */
	public static void stringDigitFind() {
		String str = "5demo9 Prateek";
		System.out.println("String: " + str);
		if (str.matches("[0-9]+") && str.length() > 2) {
			System.out.println("String contains only digits!");
		} else {
			System.out.println("String contains digits as well as other characters!");
		}
	}

	public static void main(String[] args) {
		stringDigitFind();
	}

}

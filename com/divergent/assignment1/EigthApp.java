package com.divergent.assignment1;

/**
 * Find Vowel and Consonant in String
 * 
 * @author Prateek
 *
 */
public class EigthApp {

	/**
	 * In this method we can use for find how many vowel and consonant are available in string
	 * @param str
	 */
	static void findVowelConsonant(String str) {
		int vowelC = 0, ConsC = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowelC++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ConsC++;
			}
		}
		System.out.println("Vowel are : " + vowelC);
		System.out.println("Consonant are : " + ConsC);
	}

	public static void main(String[] args) {
		String str = "This is a special ApplE case for vowel and consonant";
		findVowelConsonant(str);
	}

}

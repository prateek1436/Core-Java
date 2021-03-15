package com.divergent.assigment1;

/**
 * Find The Character Occurrence in String
 * 
 * @author Prateek
 *
 */
public class SixApp {

	static final int MAX_CHAR = 256;

	/**
	 * Method for Check char Occurrence in String
	 */
	static void getCharOccures(String str) {
		int count[] = new int[MAX_CHAR];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("Number Occurrence " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		String str = "Hello Prateek";
		getCharOccures(str);
	}

}

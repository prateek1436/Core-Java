package com.divergent.assignment2;

/**
 * Write a program that sorts by the length of the given array of strings.
 * 
 * @author Prateek
 *
 */
public class SortBylenghtString {

	/**
	 * In this method we get string parameter method that have some string different
	 * lenght,then we use that for sort the lenght.
	 * 
	 * @param strArray
	 * @return
	 */
	public static String[] sortArrayByLength(String strArray[]) {
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[j].length() < strArray[i].length()) {
					String sortstr = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = sortstr;
				}
			}
		}
		return strArray;
	}

	public static void main(String[] args) {
		String stringArray[] = { "sadfge", "qwertyuwer", "afgerhjr", "agtrjyujrtegsbfgn", "ascwebeACASC" };
		stringArray = sortArrayByLength(stringArray);
		for (String sortArray1 : stringArray) {
			System.out.println(sortArray1);
		}
	}

}

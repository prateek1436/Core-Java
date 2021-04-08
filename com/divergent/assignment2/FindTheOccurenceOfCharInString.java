package com.divergent.assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * program that finds the character with the most appearances in the given
 * string.
 * 
 * @author Prateek
 *
 */
public class FindTheOccurenceOfCharInString {

	/**
	 * In this method we can find that most apprearrence character
	 * 
	 * @param str
	 * @return
	 */
	public static char mostApprearrenceString(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		int max = 0;
		char maxChar = ' ';

		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			char currKey = (char) entry.getKey();
			int currValue = (int) entry.getValue();
			if (currValue > max) {
				max = currValue;
				maxChar = currKey;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		String str = "Hello, Prateek ABBSSBBHJJKKKKKK";
		System.out.println(mostApprearrenceString(str));
	}

}

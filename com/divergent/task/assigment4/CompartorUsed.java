package com.divergent.task.assigment4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * CompartorUsed Class
 * 
 * @author Divergent
 *
 */
public class CompartorUsed {

	/**
	 * In Main Method Sort String By Lenght
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String string[] = { "Hello", "Ram", "Is", "Good", "Person" };
		Arrays.sort(string, new SortByLength());
		for (String str : string) {
			System.out.println(str);
		}
	}

}

/**
 * Sort Method With Comparator Interface Implements
 * 
 * @author Divergent
 *
 */
class SortByLength implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return -1;
		} else if (s1.length() < s2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}
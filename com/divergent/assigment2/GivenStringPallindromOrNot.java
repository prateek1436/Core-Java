package com.divergent.assigment2;

import java.util.Scanner;

/**
 * Write a program that determines whether the given string is a palindrome or
 * not.
 * 
 * @author Prateek
 *
 */
public class GivenStringPallindromOrNot {

	/**
	 * Pallindrom is concept in which we have a string or word that have equal by
	 * reverse the word.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean pallindrome(String s) {
		char ch[] = s.toCharArray();
		int leftIdx = 0;
		int rightIdx = ch.length - 1;
		while (leftIdx < rightIdx) {
			char temp = ch[leftIdx];
			ch[leftIdx] = ch[rightIdx];
			ch[rightIdx] = temp;
			leftIdx++;
			rightIdx--;
		}
		return s.equals(String.valueOf(ch));
	}

	/**
	 * In this method we can get Pallindrom by method.
	 * 
	 * @param str
	 */
	public static void pallindromByMethod(String str) {
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		String revstr1 = str1.toString();
		if (str.equals(revstr1)) {
			System.out.println("Pallindrom");
		} else {
			System.out.println("Not Pallindrom");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		System.out.println("Pallindrom by Steps: " + pallindrome(str));
		System.out.print("Pallindrom by Method : ");
		pallindromByMethod(str);
	}

}

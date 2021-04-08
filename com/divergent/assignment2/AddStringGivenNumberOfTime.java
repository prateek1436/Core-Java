package com.divergent.assignment2;

import java.util.Scanner;

/**
 * Write a program that concatenates the same string a given number of times.
 * 
 * @author Prateek
 *
 */
public class AddStringGivenNumberOfTime {

	/**
	 * Concate String Given Number of time take value of number by User
	 * 
	 * @param str
	 */
	public static void concatenateSameStringGivenNumberOfTime(String str, int num) {
		String str1 = "";
		for (int i = 1; i <= num; i++) {
			str1 += str;
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		System.out.println("Enter Number of times :");
		int num = sc.nextInt();
		concatenateSameStringGivenNumberOfTime(str, num);
	}

}

package com.divergent.assignment2;

import java.util.Scanner;

/**
 * Recursion - Continues Print of same function, - Base Case,Find the
 * relation,Generalise, - Find the sum of n number of natural number.
 * 
 * @author Prateek
 *
 */
public class RecurtionApp {

	/**
	 * In a method sum of n natural number.
	 * 
	 * @param n
	 * @return
	 */
	static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(sum(number));
	}
}

package com.divergent.assigment2;

import java.util.Scanner;

public class RecurtionApp {

	public static void main(String[] args) {
//		Continues Print of same function
		// Base Case,Find the relation,Generalise
		// Find the sum of n number of natural number.

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(sum(number));
	}

	static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

}

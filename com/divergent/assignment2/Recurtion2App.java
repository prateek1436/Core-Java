package com.divergent.assignment2;

import java.util.Scanner;

/**
 * In a below program we can used recurtion on it.
 * 
 * @author Prateek
 *
 */
public class Recurtion2App {

	static int stepCount = 0;

	static int pow(int a, int b) {
		stepCount++;
		if (b == 0) {
			return 1;
		} else {
			return a * pow(a, b - 1);
		}
	}

	static int fastPow(int a, int b) {
		System.out.println(b);
		stepCount++;
		if (b == 0) {
			return 1;
		} else if (b % 2 == 0) {
			return fastPow(a * a, b / 2);
		} else {
			return a * fastPow(a, b - 1);
		}
	}

	static int path(int n, int m) {
		stepCount++;
		if (n == 1 || m == 1) {
			return 1;
		} else {
			return path(n, m - 1) + path(m, n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(pow(n1, n2));
		System.out.println(stepCount);
		stepCount = 0;
		System.out.println(fastPow(n1, n2));
		System.out.println(stepCount);
		System.out.println(path(n1, n2));
	}
}

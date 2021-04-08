package com.divergent.assignment7;

import java.util.Scanner;

public class TryWithResourcesAfterJava9 {

	public static void main(String[] args) {
		afterJava8();
	}

	/**
	 * After Java 9
	 */
	public static void afterJava8() {
		Scanner sc = new Scanner(System.in);
		try (sc) {
			System.out.println("Enter Name : ");
			String str = sc.nextLine();
			System.out.println("Hello , " + str);
		}
	}
}

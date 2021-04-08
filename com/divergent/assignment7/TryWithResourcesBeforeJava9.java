package com.divergent.assignment7;

import java.util.Scanner;

public class TryWithResourcesBeforeJava9 {

	public static void main(String[] args) {
		beforeJava9();
	}

	/**
	 * Before Java 9
	 */
	public static void beforeJava9() {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter Name : ");
			String str = sc.nextLine();
			System.out.println("Hello , " + str);
		}
	}
}

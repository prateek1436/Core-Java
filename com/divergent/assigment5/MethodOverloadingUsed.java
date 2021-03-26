package com.divergent.assigment5;

/**
 * Method Overloading Class
 * 
 * @author Divergent
 *
 */
public class MethodOverloadingUsed {

	public static void add() {
		System.out.println("Non Parameterized Method");
	}

	public static void add(int a, int b) {
		System.out.println("Add Two Value " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("Add Three Value " + (a + b + c));
	}

	public static void main(String[] args) {
		add();
		add(10, 20);
		add(10, 10, 20);
	}

}

package com.divergent.assigment2;

/**
 * Why you shouldn't use equality operator to compare float values?
 * 
 * @author Prateek
 *
 */
public class FirstApp {

	/**
	 * Compare the Float value on Compare Method float a; float b; are variable
	 * 
	 * @param a
	 * @param b
	 */
	static void compareFloatValue(float a, float b) {
		System.out.println(Float.compare(a, b));
		if (Float.compare(a, b) == 0) {
			System.out.println(a = b);
		} else {
			System.out.println(a != b);
		}
	}

	public static void main(String[] args) {
		Float a = (0.3f * 0.3f) + 0.1f;
		Float b = 1f;
		compareFloatValue(a, b);
	}

}

package com.divergent.assignment5;

/**
 * Chaining Class
 * 
 * @author Divergent
 *
 */
class ChainingClass {

	/**
	 * Chaining Custructor with Chinaing fired
	 */
	ChainingClass() {
		this("Parameter");
		System.out.println("Default Custructor");
	}

	/**
	 * Parameterized Custructor
	 * 
	 * @param para
	 */
	ChainingClass(String para) {
		System.out.println("Parameterized Custructor");
	}
}

/**
 * Chaining Custructor Used Class
 * 
 * @author Divergent
 *
 */
public class ChainingCustructorUsed {

	public static void main(String[] args) {
		ChainingClass chainingClass = new ChainingClass();
	}

}

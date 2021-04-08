package com.divergent.assignment6;

/** 
 * Objects Equals Method
 * @author Divergent
 *
 */
public class ObjectsEqualsUsed {

	public static void main(String[] args) {
		Integer integer = new Integer(50);
		
		Float float1 = new Float(50f);
		
		System.out.println(integer.equals(float1));
		System.out.println(float1.equals(integer));
		System.out.println(integer.equals(50));
		System.out.println(float1.equals(50f));
	}

}

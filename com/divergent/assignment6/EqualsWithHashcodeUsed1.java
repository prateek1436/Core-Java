package com.divergent.assignment6;

/**
 * HashCode Equals Method
 * @author Divergent
 *
 */
public class EqualsWithHashcodeUsed1 {

	public static void main(String[] args) {
		Integer integer = new Integer(255);
		Integer integer1 = new Integer(255);
		
		int hashValue = integer.hashCode();
		
		int hashValue1 = integer1.hashCode();
		
		System.out.println(hashValue);
		System.out.println(hashValue1);
	}

}

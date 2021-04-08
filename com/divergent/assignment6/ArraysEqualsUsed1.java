package com.divergent.assignment6;

import java.util.Arrays;

/**
 * Arrays Equals Methods
 * @author Divergent
 *
 */
public class ArraysEqualsUsed1 {

	public static void main(String[] args) {
		int arr1[] = new int[]{1,2,3,4};
		int arr2[] = new int[]{1,2,3,4};
		System.out.println(Arrays.equals(arr1, arr2));
		
		int arr3[] = new int[] {1,4,5,6};
		System.out.println(Arrays.equals(arr1, arr3));
	}

}

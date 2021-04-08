package com.divergent.assignment6;

import java.util.Arrays;
import java.util.Objects;

/**
 * Employee Class with Equals Method
 * @author Divergent
 *
 */
class Employees1 {
	int id;
	String name;
	String city;

	Employees1(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public boolean equals(Employees objects) {
		Employees employees = objects;
		return this.id == employees.id && this.name.equals(employees.name) && this.city.equals(employees.city);
	}
}

/**
 * Arrays Equals Methods
 * 
 * @author Divergent
 *
 */
public class ArraysEqualsUsed2 {

	public static void main(String[] args) {
		Employees1[] arr1 = { new Employees1(111, "Ramu", "Indore"), new Employees1(131, "Shamu", "Ujjain") };

		Employees1[] arr2 = { new Employees1(111, "Ramu", "Indore"), new Employees1(131, "Shamu", "Ujjain") };

		Employees1[] arr3 = { new Employees1(111, "Ramu", "Indore"), new Employees1(102, "Ravi", "Ujjain") };

		System.out.println(Arrays.equals(arr1, arr2));

		System.out.println(Arrays.equals(arr2, arr3));
	}

}

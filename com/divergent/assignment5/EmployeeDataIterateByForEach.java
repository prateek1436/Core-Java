	package com.divergent.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee1 Class
 * Employee1 Class Parameterized Custructor
 * @author Divergent
 *
 */
class Employee1 {
	String name, dept;
	int id;

	Employee1(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}

/**
 * Employee Data Iterate By For Each Loop
 * 
 * @author Divergent
 *
 */
public class EmployeeDataIterateByForEach {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101, "Ravi", "Account"));
		list.add(new Employee1(102, "Ravindra", "Staff"));
		list.add(new Employee1(103, "Shyam", "Teacher"));

		for (Employee1 emp : list) {
			System.out.println(emp.id + " " + emp.name + " " + emp.dept);
		}

	}

}

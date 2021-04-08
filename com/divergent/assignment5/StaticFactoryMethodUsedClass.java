package com.divergent.assignment5;

import java.util.Date;
import java.util.Objects;

/**
 * Employee Class
 * 
 * @author Divergent
 *
 */
class Employee {
	String name;
	Double salary;
	Date hireDate;

	/**
	 * Private Employee Custructor
	 * 
	 * @param name
	 * @param salary
	 * @param hireDate
	 */
	private Employee(String name, Double salary, Date hireDate) {
		Objects.requireNonNull(hireDate, "NullPointerException");

		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public static Employee getInstance(String name, Double salary, Date hireDate) {
		return new Employee(name, salary, hireDate);
	}

	public String toString() {
		return name + " " + salary + " " + hireDate;
	}

	public boolean equals(Employee employee) {
		return employee.name.equals(name) && employee.salary.equals(salary);
	}
}

/**
 * Static Factory Methods
 * 
 * @author Divergent
 *
 */
public class StaticFactoryMethodUsedClass {

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		emp[0] = Employee.getInstance("Shamu", 52000.0, new Date());
		emp[1] = Employee.getInstance("Ravina", 12200.0, new Date());
		emp[2] = Employee.getInstance("Ramu", 82000.0, new Date());

		for (Employee emp1 : emp) {
			System.out.println(emp1);
		}

		/**
		 * Check Equals GetInstance Method
		 */
		Employee em = Employee.getInstance("Ramu", 82000.0, new Date());
		System.out.println(em.equals(emp[2]));

	}

}

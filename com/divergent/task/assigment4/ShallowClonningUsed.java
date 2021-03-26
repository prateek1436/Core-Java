package com.divergent.task.assigment4;

/**
 * Employee Class With Clonable Implement
 * 
 * @author Divergent
 *
 */
class Employee implements Cloneable {
	String name;
	int id;

	/**
	 * Employee Class Custructor with Parameter
	 * 
	 * @param name
	 * @param id
	 */
	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
	}

	/**
	 * clone() Method
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

/**
 * ShallowCloningUsed Class
 * 
 * @author Divergent
 *
 */
public class ShallowClonningUsed {

	/**
	 * Main Method
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee("Shyam", 1);
		Employee emp1 = (Employee) employee.clone();
		System.out.println(employee.name + " " + employee.id);
		System.out.println(emp1.name + " " + emp1.id);
	}

}

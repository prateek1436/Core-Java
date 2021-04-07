package com.divergent.assigment6;

/**
 * Employee Class with toString Method
 * @author Divergent
 *
 */
class Employees{
	int id;
	String name;
	String city;
	
	Employees(int id,String name,String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return id + " " + name + " " + city;
	}
}
public class ToStringMethodUsed {

	public static void main(String[] args) {
		Employees employees = new Employees(101, "Ramu", "Indore");
		Employees employees2 = new Employees(102, "Shamu", "Ujjain");
		System.out.println(employees);
		System.out.println(employees2);
	}

}

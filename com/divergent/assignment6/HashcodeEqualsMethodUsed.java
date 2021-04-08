package com.divergent.assignment6;

/**
 * Student class for used of hashcode
 * 
 * @author Divergent
 *
 */
class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null && !(obj instanceof Student)) // Null Checked
			return false;
		if (obj == this)
			return true;
		return this.id == ((Student) obj).id;
	}
}

public class HashcodeEqualsMethodUsed {

	public static void main(String[] args) {
		Student std1 = new Student(1, "Ram");
		Student std2 = new Student(1, "Ram");

		System.out.println("Student1 hashcode = " + std1.hashCode());
		System.out.println("Student2 hashcode = " + std2.hashCode());
		System.out.println("Checking equality between Student1 and Student2 = " + std1.equals(std2));
	}

}

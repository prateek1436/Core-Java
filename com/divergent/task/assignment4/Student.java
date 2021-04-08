package com.divergent.task.assignment4;

/**
 * Student Class with Implement Comparable sort By Age
 * 
 * @author Divergent
 *
 */
public class Student implements Comparable<Student> {
	int rollno, age;
	String name;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	/**
	 * compareTo Method for compare on Age
	 */
	public int compareTo(Student st) {
		if (age == st.age) {
			return 0;
		} else if (age < st.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

package com.divergent.task.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable Interface sort by name
 * @author Divergent
 *
 */
public class ComparableUsed {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,"Ram",23));
		list.add(new Student(102,"Ramiya",27));
		list.add(new Student(103,"Shyam",21));
		Collections.sort(list);
		for(Student st : list) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}

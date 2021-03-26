package com.divergent.task.assigment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * ComparatorUsed Class
 * 
 * @author Divergent
 *
 */
public class ComparatorUsed {

	/**
	 * List of Student Sort By Name
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student1(101, "Ram", 25));
		list.add(new Student1(102, "Sita", 23));
		list.add(new Student1(103, "Lakhan", 20));

		System.out.println("Sorting By Name");
		Collections.sort(list, new NameCompare());
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Student1 st = (Student1) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}

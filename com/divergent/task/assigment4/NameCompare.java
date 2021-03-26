package com.divergent.task.assigment4;

import java.util.Comparator;

/**
 * NameComapre Class with Implement Comparator
 * 
 * @author Divergent
 *
 */
public class NameCompare implements Comparator {

	/**
	 * compare Method with name
	 */
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;

		return s1.name.compareTo(s2.name);
	}
}

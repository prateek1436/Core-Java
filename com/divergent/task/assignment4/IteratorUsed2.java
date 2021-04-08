package com.divergent.task.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * IteratorUsed2 Used
 * 
 * @author Divergent
 *
 */
public class IteratorUsed2 {

	/**
	 * Main Method Iterate Number And Remove It.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(52);
		list.add(23);
		list.add(2);
		list.add(10);

		Iterator<Integer> number = list.iterator();
		while (number.hasNext()) {
			Integer i = number.next();
			if (i > 10) {
				number.remove();
			}
		}
		System.out.println(list);
	}

}

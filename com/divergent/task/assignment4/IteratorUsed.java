package com.divergent.task.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * IteratorUsed Class
 * 
 * @author Divergent
 *
 */
public class IteratorUsed {

	/**
	 * Main Method With Iterate List
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("BMW");
		list.add("SKODA");
		list.add("HONDA");
		list.add("AUDI");
		Iterator<String> listIte = list.iterator();
		while (listIte.hasNext()) {
			System.out.println(listIte.next());
		}
	}

}

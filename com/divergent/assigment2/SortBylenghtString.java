package com.divergent.assigment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


class LenghtCompare implements Comparator{
	public int compare(Object o1,Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);
	}
}
public class SortBylenghtString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello Ram");
		list.add("Shyam");
		list.add("Snehvarkhas");
		list.add("Patel");
		Collections.sort(list,new LenghtCompare());  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		String st=(String) itr.next();  
		System.out.println(st);  
		}  
	}

}

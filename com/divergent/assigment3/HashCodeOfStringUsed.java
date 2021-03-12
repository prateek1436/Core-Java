package com.divergent.assigment3;

public class HashCodeOfStringUsed {

	public static void main(String[] args) {
		System.out.println("A".hashCode());
		System.out.println("BC".hashCode());
	}

}
//When we create a String object using the new() operator, it always creates a new object in heap memory.
//On the other hand, if we create an object using String literal syntax
//e.g. “Baeldung”, it may return an existing object from the String pool, if it already exists.
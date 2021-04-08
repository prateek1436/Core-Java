package com.divergent.assignment6;

/**
 * Static Binding 
 * @author Divergent
 *
 */
public class StaticBindingUsed1 {

	private void eat() {
		System.out.println("Dog is eating...");
	}
	public static void main(String[] args) {
		StaticBindingUsed1 used1 = new StaticBindingUsed1();
		used1.eat();
	}

}

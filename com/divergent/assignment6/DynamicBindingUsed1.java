package com.divergent.assignment6;

/**
 * Dynamic Binding 
 * @author Divergent
 *
 */
class Animal1{
	void eat() {
		System.out.println("Eating....");
	}
}

class Dog1 extends Animal1{
	void eat() {
		System.out.println("dog is eating");
	}
}

public class DynamicBindingUsed1 {

	public static void main(String[] args) {
//		Animal1 animal1 = new Animal1();
		Animal1 animal1 = new Dog1();
		System.out.println(animal1 instanceof Animal1);
		animal1.eat();
	}
}

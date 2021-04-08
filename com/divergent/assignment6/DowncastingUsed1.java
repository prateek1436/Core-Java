package com.divergent.assignment6;

class Animal2 {

}

class Dog3 extends Animal2 {
	static void methods(Animal2 a) {
		if (a instanceof Dog3) {
			Dog3 dog3 = (Dog3) a;
			System.out.println("Ok Casting");
		}
	}
}

public class DowncastingUsed1 {

	public static void main(String[] args) {
		Animal2 a = new Dog3();
		Dog3.methods(a);
	}

}

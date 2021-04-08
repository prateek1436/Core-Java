package com.divergent.assignment6;

class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}

//class BabyDog extends Dog{
//	void weep() {
//		System.out.println("Weeping...");
//	}
//}

class Cat extends Animal{
	void meow() {
		System.out.println("meowing..");
	}
}
public class InheritanceUsed2 {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		BabyDog dog = new BabyDog();
//		dog.bark();
//		dog.eat();
//		dog.weep();
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
	}

}

package com.divergent.assignment6;

/**
 * Simple Inhertance
 * @author Divergent
 *
 */
class Employee1{
	float salary = 40000;
}
public class InheritanceUsed1 extends Employee1{

	int bonus = 10000;
	public static void main(String[] args) {
		InheritanceUsed1 used1 = new InheritanceUsed1();
		System.out.println("Programmer Salary is : "+used1.salary);
		System.out.println("Bonus of Programmer is : "+used1.bonus);
	}

}

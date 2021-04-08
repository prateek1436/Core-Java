package com.divergent.assignment5;

/**
 * CustructorClass class
 * @author Divergent
 *
 */
class CustructorClass{
	
	/**
	 * Non Parameter Custructor
	 */
	CustructorClass(){
		System.out.println("Non Parameterized Custructor");
	}
	
	/**
	 * Parameterized Custructor 
	 * @param a
	 * @param b
	 */
	CustructorClass(int a,int b){
		System.out.println("Parameterized Custructor");
	}
	
	/**
	 * Parameterized Custructor with different Parameter
	 * @param id
	 * @param name
	 */
	CustructorClass(int id,String name){
		System.out.println("Change Parameter");
	}
}

/**
 * {@link CustructorOverloadingUsed} Class
 * @author Divergent
 *
 */
public class CustructorOverloadingUsed {

	public static void main(String[] args) {
		CustructorClass custructorClass = new CustructorClass();
		CustructorClass custructorClass2 = new CustructorClass(10, 20);
		CustructorClass custructorClass3 = new CustructorClass(10, "Kali");
	}

}

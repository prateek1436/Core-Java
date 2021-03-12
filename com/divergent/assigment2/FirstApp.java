package com.divergent.assigment2;

public class FirstApp {

	public static void main(String[] args) {
		Float a = (0.3f*0.3f)+0.1f;
		Float b = 1f;
		System.out.println(Float.compare(a, b));
		if(Float.compare(a, b)==0) {
			System.out.println(a=b);
		}else {
			System.out.println(a!=b);
		}
		if(a.compareTo(b)==0) {
			System.out.println("");
		}
	}

}

package com.divergent.assigment2;

public class AddStringGivenNumberOfTime {

	public static void main(String[] args) {
		String str = "ABC";
		for(int i = 0;i<=5;i++) {
			str = str+str;
			System.out.println(str);
		}
	}

}

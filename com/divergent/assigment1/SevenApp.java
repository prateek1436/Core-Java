package com.divergent.assigment1;

public class SevenApp {

	public static void main(String[] args) {
//		String text = "abc125AXYA12"; 
//		String number=" "; 
//
//		if (text.contains("[a-zA-Z]+") == false && text.length() > 2) {
//		    number = text; 
//		    System.out.println(number);
//		}
		
		String str = "5demo9 Prateek";
	      System.out.println("String: "+str);
	      if(str.matches("[0-9]+") && str.length() > 2) {
	         System.out.println("String contains only digits!");
	      } else {
	         System.out.println("String contains digits as well as other characters!");
	      }
		
	}

}

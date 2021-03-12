package com.divergent.assigment2;

import java.util.Scanner;

public class RemoveDuplicateCharcter {
	 public static String removeGivenCharacter(String str, char ch) {

	        String s = "";
	        char c[] = str.toCharArray();

	        for(int i = 0; i < str.length(); i++) {
	            if (c[i] == ch) {
	                continue;
	            } else {
	                s += c[i];
	            }
	        }
	        return s;
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		char c = sc.nextLine().charAt(0);
		String str = sc.next();
		System.out.println(removeGivenCharacter(str, c));
		
		
		String str1 = "Indian is my Country";
		System.out.println(charRemoveAt(str1, 9));
	}
	
	public static String charRemoveAt(String str,int p) {
		return str.substring(0, p)+str.substring(p+1);
	}

}

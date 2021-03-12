package com.divergent.assigment2;

import java.util.Scanner;

public class SecondApp {
	public static String swapString(String str,int i,int j) {
		char[] b = str.toCharArray();
		char ch ;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int len = str.length();
		System.out.println("All Permutations are : ");
		generatePermut(str,0,len);
	}
	public static void generatePermut(String str,int start,int end) {
		if(start==end-1) {
			System.out.println(str);
		}else {
				for (int i = start; i < end; i++){  
	                str = swapString(str,start,i);
	                generatePermut(str,start+1,end);
	                str = swapString(str,start,i);  
	         }  
		}
	}

}

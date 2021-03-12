package com.divergent.assigment2;

import java.util.Scanner;

public class GivenStringPallindromOrNot {

	public static boolean palindrome(String s) {

        char ch[] = s.toCharArray();

        int leftIdx = 0;
        int rightIdx = ch.length - 1;

        while(leftIdx < rightIdx) {
            char temp = ch[leftIdx];
            ch[leftIdx] = ch[rightIdx];
            ch[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }

        return s.equals(String.valueOf(ch));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		String revstr1 = str1.toString();
		if(str.equals(revstr1)) {
			System.out.println("Pallindrom");
		}else {
			System.out.println("Not Pallindrom");
		}
		System.out.println(palindrome(str));
//		var x = 10;
//		System.out.println(x);
	}
	


}

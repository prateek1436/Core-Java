package com.divergent.assigment1;

import javax.sound.sampled.ReverbType;
class ReversWord{
	public static String reverseWordCharacters(String text1) {
        String reverse = "";
        int length = text1.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + text1.charAt(i);
            System.out.println();
        }
        return reverse;
    }

}
public class FiveApp {
	public static void main(String[] args) {
		StringBuffer strB = new StringBuffer("Hello Prateek");
		System.out.println(strB);
		strB.reverse();
		System.out.println(strB);
		
		ReversWord reverword = new ReversWord();
		System.out.println("Revesing Word are: "+reverword.reverseWordCharacters("Hello Prateek"));
	}
}

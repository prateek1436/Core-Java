package com.divergent.assigment2;

public class StringContainIntoSubString {

	public static void main(String[] args) {
		String match = null;
		String str = "HelloPrateek Patel";
		String substr = "Prateek";
		for (int i = 0; i <= str.length() - substr.length(); i++) {
			match = str.substring(i, i + substr.length());
		}
		if (match.equals(substr)) {
			System.out.println(match);
		}else {
			System.out.println("None of match");
		}
	}
}

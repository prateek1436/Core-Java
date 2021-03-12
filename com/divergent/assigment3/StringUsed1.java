package com.divergent.assigment3;

public class StringUsed1 {

	public static void main(String[] args) {
		String all = String.join("/", "S","M","L","XL");
		System.out.println(all);
		String s = "Hello".substring(0, 3);
		System.out.println(s);
		String str = null;
		if(str.length()!=0||str!=null) {//we can change it then true
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}

//CompactString :- It after Java8 it can initialize internally 
//code point and code unit 
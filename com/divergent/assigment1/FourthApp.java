package com.divergent.assigment1;

class NonRepeatedChar{
	public static char findFirstNonRepChar(String input){
		 char currentChar = '\0';
		 int len = input.length();
		 for(int i=0;i<len;i++){
		    currentChar = input.charAt(i);
		    if((i!=0) && (currentChar!=input.charAt(i-1)) && (i==input.lastIndexOf(currentChar))){
		        return currentChar;
		    }
		 }
		 return currentChar;
		}
}
public class FourthApp {
	public static void main(String[] args) {
		NonRepeatedChar nochar = new NonRepeatedChar();
		nochar.findFirstNonRepChar("Hello world");
		System.out.println(nochar.findFirstNonRepChar("Hello world!"));
	}

}

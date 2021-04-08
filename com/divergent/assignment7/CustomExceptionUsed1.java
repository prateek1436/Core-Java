package com.divergent.assignment7;

class UserException extends Exception{
	String str;
	UserException(String str){
		str = str;
	}
	
	public String toString() {
		return "Given String is : "+str;
	}
}
/**
 * User Defined Exception in a Class
 * @author Divergent
 *
 */
public class CustomExceptionUsed1 {
	public static void main(String[] args) {
		try {
			throw new UserException("User Defined Exception");
		} catch (UserException e) {
			System.out.println("User defined Exception in catch Block");
			System.out.println(e);
		}
	}
}

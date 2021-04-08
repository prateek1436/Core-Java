package com.divergent.assignment3;

public class ImmutabiltyString {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String accountNo = "ABC123";
		java.lang.reflect.Field field = String.class.getDeclaredField(accountNo);
		field.setAccessible(true);
		char[] value = (char[]) field.get(accountNo);
		value[0] = 'X';
		value[1] = 'Y';
		value[2] = 'Z';
		System.out.println(accountNo);
	}

}

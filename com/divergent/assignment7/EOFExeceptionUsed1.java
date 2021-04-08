package com.divergent.assignment7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EOFExeceptionUsed1 {

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("C:\\Users\\sl\\Desktop\\Data.txt");
		while(true) {
			char ch;
			ch = (char) stream.read();
			System.out.print(ch);
		}
	}

}

package com.divergent.assignment7;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Try with resources used for close Automatically
 * 
 * @author Divergent
 *
 */
public class TryWithResourcesUsed1 {

	public static void main(String[] args) {
		try (var in = new Scanner(new FileInputStream("C:\\Users\\sl\\Desktop\\Data.txt"));
				var out = new PrintWriter("Data.txt", StandardCharsets.UTF_8)) {
			while (in.hasNext()) {
				System.out.println(in.next().toUpperCase());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

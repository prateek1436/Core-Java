package com.divergent.assignment2;

/**
 * Strictfp used in this class.
 * 
 * @author Prateek
 *
 */
strictfp class CalculationStrictfpUsed {
	double num1 = 10e+102;
	double num2 = 6e+08;

	double calculation() {
		return num1 + num2;
	}
}

/**
 * Used Of Strictfp
 * 
 * @author Prateek
 *
 */
public class StrictfpUsed {

	public static void main(String[] args) {
		CalculationStrictfpUsed sp = new CalculationStrictfpUsed();
		System.out.println(sp.calculation());
	}

}

/**
 * <pre>
 * Name			: _35NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  5		6		7		8		9
 *				  		4		5		6		7
 *				  				3		4		5
 * 				  						2		3
 * 				  								1
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _35NumberPyramid {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many lines : ");
			int n = scanner.nextInt();

			System.out.println("Displaying the number pyramid");
			for (int i = 0; i < n; i++) {
				// i blanks for each row
				for (int j = 0; j < i; j++) {
					System.out.print(" \t");
				}

				int valueToPrint = n - i;
				for (int j = 0; j < n - i; j++) {
					System.out.print((valueToPrint++) + "\t");
				}
				System.out.println();
			}
		}
	}
}

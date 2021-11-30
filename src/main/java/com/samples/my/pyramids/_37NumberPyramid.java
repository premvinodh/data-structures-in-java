/**
 * <pre>
 * Name			: _37NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  1		0		1		0		1		0		1		0		1
 *				  		0		1		0		1		0		1		0
 *				  				1		0		1		0		1
 * 				  						0		1		0
 * 				  								1
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _37NumberPyramid {
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

				int valueToPrint = ((n - i) % 2);
				for (int j = 0; j < n - i; j++) {
					System.out.print(valueToPrint + "\t");
					valueToPrint = valueToPrint == 1 ? 0 : 1;
				}

				for (int j = 0; j < n - i - 1; j++) {
					System.out.print(valueToPrint + "\t");
					valueToPrint = valueToPrint == 1 ? 0 : 1;
				}
				System.out.println();
			}
		}
	}
}

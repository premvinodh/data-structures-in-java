/**
 * <pre>
 * Name			: _34NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  								1
 *				  						0		1		0
 *				  				1 		0 		1		0		1
 * 				  		0		1		0		1		0		1		0
 * 				  1		0		1		0		1		0		1		0		1
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _34NumberPyramid {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many lines : ");
			int n = scanner.nextInt();

			System.out.println("Displaying the number pyramid");
			for (int i = 1; i <= n; i++) {
				// print (n-i)blanks
				for (int k = 0; k < n - i; k++) {
					System.out.print(" \t");
				}

				int valueToPrint = i % 2;
				for (int j = 0; j < i; j++) {
					System.out.print(valueToPrint + "\t");
					valueToPrint = valueToPrint == 1 ? 0 : 1;
				}

				for (int j = 0; j < i - 1; j++) {
					System.out.print(valueToPrint + "\t");
					valueToPrint = valueToPrint == 1 ? 0 : 1;
				}
				System.out.println();
			}
		}
	}
}

/**
 * <pre>
 * Name			: _33NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  								1
 *				  						2		3		2
 *				  				3 		4 		5		4		3
 * 				  		4		5		6		7		6		5		4
 * 				  5		6		7		8		9		8		7		6		5
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _33NumberPyramid {
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

				int valueToPrint = i;
				for (int j = 0; j < i; j++) {
					System.out.print((valueToPrint++) + "\t");
				}

				valueToPrint--;
				for (int j = 0; j < i - 1; j++) {
					System.out.print((--valueToPrint) + "\t");
				}
				System.out.println();
			}
		}
	}
}

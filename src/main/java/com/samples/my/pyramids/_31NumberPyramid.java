/**
 * <pre>
 * Name			: _31NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  								1
 *				  						2		3
 *				  				3 		4 		5
 * 				  		4		5		6		7
 * 				  5		6		7		8		9
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _31NumberPyramid {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many lines : ");
			int n = scanner.nextInt();

			System.out.println("Displaying the number pyramid");
			for (int i = 1; i <= n; i++) {
				int valueToPrint = i;

				// print (n-i)blanks
				for (int k = 0; k < n - i; k++) {
					System.out.print(" \t"); //This should be space/number followed by tab
				}

				for (int j = 0; j < i; j++) {
					System.out.print((valueToPrint++) + "\t");
				}
				System.out.println();
			}
		}
	}
}

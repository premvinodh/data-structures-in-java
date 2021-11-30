/**
 * <pre>
 * Name			: _30NumberPyramid.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the following number pyramid
 * 				  the input(s) - n
 * 				  0
 *				  1		0
 *				  0 	1 		0
 * 				  1		0		1		0
 * 				  0		1		0		1		0
 * </pre>
 */
package com.samples.my.pyramids;

import java.util.Scanner;

public class _30NumberPyramid {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many lines : ");
			int n = scanner.nextInt();

			System.out.println("Displaying the number pyramid");
			for (int i = 1; i <= n; i++) {
				int valueToPrint = (i + 1) % 2;
				for (int j = 0; j < i; j++) {
					System.out.print(valueToPrint + "\t");
					if (valueToPrint == 0) {
						valueToPrint = 1;
					} else {
						valueToPrint = 0;
					}
				}
				System.out.println();
			}
		}
	}
}

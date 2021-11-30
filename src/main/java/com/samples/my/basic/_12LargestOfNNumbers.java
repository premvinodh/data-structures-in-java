/**
 * <pre>
 * Name			: _12LargestOfNNumbers.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output the largest.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _12LargestOfNNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers :");
			int n = scanner.nextInt();

			int max = -1;
			for (int i = 0; i < n; i++) {
				System.out.print("Enter number :");
				int a = scanner.nextInt();

				if (a > max) {
					max = a;
				}
			}
			System.out.println("Largest =" + max);
		}
	}
}

/**
 * <pre>
 * Name			: _14LargestAndSmallestOfNNumbers.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output the largest and smallest.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _14LargestAndSmallestOfNNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers :");
			int n = scanner.nextInt();

			System.out.print("Enter number :");
			int a = scanner.nextInt();
			int min = a;
			int max = a;
			for (int i = 0; i < n - 1; i++) {
				System.out.print("Enter number :");
				a = scanner.nextInt();

				if (a < min) {
					min = a;
				}
				if (a > max) {
					max = a;
				}
			}
			System.out.println("Largest =" + max);
			System.out.println("Smallest =" + min);
		}
	}
}

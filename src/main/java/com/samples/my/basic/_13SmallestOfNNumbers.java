/**
 * <pre>
 * Name			: _13SmallestOfNNumbers.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output the smallest.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _13SmallestOfNNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers :");
			int n = scanner.nextInt();

			System.out.print("Enter number :");
			int a = scanner.nextInt();
			int min = a;
			for (int i = 0; i < n - 1; i++) {
				System.out.print("Enter number :");
				a = scanner.nextInt();

				if (a < min) {
					min = a;
				}
			}
			System.out.println("Smallest =" + min);
		}
	}
}

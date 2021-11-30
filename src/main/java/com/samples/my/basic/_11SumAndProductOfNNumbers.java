/**
 * <pre>
 * Name			: _11SumAndProductOfNNumbers.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output their sum and product.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _11SumAndProductOfNNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers :");
			int n = scanner.nextInt();

			int sum = 0;
			int product = 1;
			for (int i = 0; i < n; i++) {
				System.out.print("Enter number :");
				int a = scanner.nextInt();

				sum = sum + a;
				product = product * a;
			}
			System.out.println("Sum =" + sum);
			System.out.println("Product =" + product);
		}
	}
}

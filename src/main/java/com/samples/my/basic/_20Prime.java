/**
 * <pre>
 * Name			: _20Prime.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept an integer and check whether it is a prime or not.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _20Prime {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			
			int factorCount = 0;
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					factorCount++;
				}
			}
			
			if (factorCount == 1) {
				System.out.println("Number "+n+" is prime");
			} else {
				System.out.println("Number "+n+" is not prime");
			}

		}
	}
}

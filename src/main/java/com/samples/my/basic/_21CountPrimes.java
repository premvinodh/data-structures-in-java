/**
 * <pre>
 * Name			: _21CountPrimes.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and count how many are primes.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _21CountPrimes {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers : ");
			int n = scanner.nextInt();

			int primeCount = 0;
			for (int k = 0; k < n; k++) {
				System.out.print("Enter number : ");
				int a = scanner.nextInt();

				int factorCount = 0;
				for (int i = 2; i <= a; i++) {
					if (a % i == 0) {
						factorCount++;
					}
				}

				if (factorCount == 1) {
					primeCount++;
				}
			}
			System.out.println("Number of primes: " + primeCount);
		}
	}
}

/**
 * <pre>
 * Name			: _22AllPrimesBetween1AndN.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output all prime numbers from 1 to 'n'.
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _22AllPrimesBetween1AndN {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers: ");
			int n = scanner.nextInt();

			int primeCount = 0;
			for (int a = 1; a <= n; a++) {
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

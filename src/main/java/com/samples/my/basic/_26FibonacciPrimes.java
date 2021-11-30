/**
 * <pre>
 * Name			: _26FibonacciPrimes.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' and output all fibonacci primes less than n. 
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _26FibonacciPrimes {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = scanner.nextInt();

			int firstNum = 0;
			int secondNum = 1;
			System.out.println(firstNum + " " + secondNum);

			for (int i = 0; i < n - 2; i++) {
				int nextNum = firstNum + secondNum;

				int factorCount = 0;
				for (int j = 2; j <= nextNum; j++) {
					if (nextNum % j == 0) {
						factorCount++;
					}
				}

				if (factorCount == 1) {
					System.out.println(nextNum + " is Fibonacci Prime");
				} else {
					System.out.println(nextNum + " is not a Fibonacci Prime");
				}

				firstNum = secondNum;
				secondNum = nextNum;
			}
		}
	}
}

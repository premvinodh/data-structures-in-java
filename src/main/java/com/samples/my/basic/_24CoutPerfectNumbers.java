/**
 * <pre>
 * Name			: _24CoutPerfectNumbers.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and count how many are perfect.
 *				   A number k whose factors are taken upto k/2 and then the factors are 
 *				   added, if the sum of the factors is equal to k then it is a perfect 
 *				   number. Eg., 6, 28, 496, 8128
 * 				  the input(s) - n   
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _24CoutPerfectNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers : ");
			int n = scanner.nextInt();

			int noOfPerfectNumbers = 0;
			for (int i = 1; i <= n; i++) {
				System.out.print("Enter a number : ");
				int a = scanner.nextInt();

				int factorCount = 0;
				for (int j = 1; j <= a / 2; j++) {
					if (a % j == 0) {
						factorCount = factorCount + j;
					}
				}

				if (a == factorCount) {
					noOfPerfectNumbers++;
				}
			}
			System.out.println("Number of perfect numbers : " + noOfPerfectNumbers);
		}
	}
}

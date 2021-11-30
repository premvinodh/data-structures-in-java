/**
 * <pre>
 * Name			: _25AllPerfectsBetween1AndN.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept 'n' numbers and output all perfect numbers from 1 to 'n'.
 *				   A number k whose factors are taken upto k/2 and then the factors are added, 
 *				   if the sum of the factors is equal to k then it is a perfect number. Eg., 6, 28, 496, 8128
 * 				  the input(s) - n -  
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _25AllPerfectsBetween1AndN {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers : ");
			int n = scanner.nextInt();

			int noOfPerfectNumbers = 0;
			for (int i = 1; i <= n; i++) {
				int factorCount = 0;
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) {
						factorCount = factorCount + j;
					}
				}

				if (i == factorCount) {
					System.out.println("Perfect Number : " + i);
				}
			}

		}
	}
}

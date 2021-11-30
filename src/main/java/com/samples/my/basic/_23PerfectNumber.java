/**
 * <pre>
 * Name			: _23PerfectNumber.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept a number 'a' check whether it is a perfect number or not.
 *				   A number k whose factors are taken upto k/2 and then the factors are added, 
 *				   if the sum of the factors is equal to k then it is a perfect number.
 * 				  the input(s) - n
 * 				  Eg., 6, 28, 496, 8128
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _23PerfectNumber {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int a = scanner.nextInt();

			int factorCount = 0;
			for (int i = 1; i <= a / 2; i++) {
				if (a % i == 0) {
					factorCount = factorCount + i;
				}
			}

			if (a == factorCount) {
				System.out.println("Number " + a + " is perfect");
			} else {
				System.out.println("Number " + a + " is not perfect");
			}

		}
	}
}

/**
 * <pre>
 * Name			: _16SumOfDigitsOfANumber.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to enter an integer and find the sum of its digits.
 * 				  the input(s) - n
 * 				  Example :: n = 26714, sum of digits = 20
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _16SumOfDigitsOfANumber {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number:");
			int n = scanner.nextInt();
			int originalNum = n;

			int sum = 0;
			while (n != 0) {
				int digit = n % 10;
				sum = sum + digit;
				n = n / 10;
			}
			System.out.println("Sum of the digits of number " + originalNum + " is " + sum);
		}
	}
}

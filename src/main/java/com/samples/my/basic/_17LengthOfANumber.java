/**
 * <pre>
 * Name			: _17LengthOfANumber.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept an integer and find its length or number of digits the number has.
 * 				  the input(s) - n
 * 				  Example :: n = 26714, length of digits = 5
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _17LengthOfANumber {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number:");
			int n = scanner.nextInt();
			int originalNum = n;

			int length = 0;
			while (n != 0) {
				length++;
				n = n / 10;
			}
			System.out.println("Length of the digits of number " + originalNum + " is " + length);
		}
	}
}

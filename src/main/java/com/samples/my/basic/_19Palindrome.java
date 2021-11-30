/**
 * <pre>
 * Name			: _19Palindrome.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept an integer and check whether it is a palindrome or not.
 * 				  the input(s) - n
 * 				  Eg., n = 121 => Palindrome
 * 					   n = 123 => Not Palindrome 
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _19Palindrome {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = scanner.nextInt();
			int originalNum = n;

			int reverse = 0;
			while (n != 0) {
				int digit = n % 10;
				reverse = reverse * 10 + digit;
				n = n / 10;

			}
			if (originalNum == reverse) {
				System.out.println("Number " + originalNum + " is palindrome.");
			} else {
				System.out.println("Number " + originalNum + " is not palindrome.");
			}

		}
	}
}

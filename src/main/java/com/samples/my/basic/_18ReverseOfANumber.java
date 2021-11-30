/**
 * <pre>
 * Name			: _18ReverseOfANumber.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept an integer and output its reverse.
 * 				  the input(s) - n
 * 				  Eg., n = 26714 => reverse = 41762
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _18ReverseOfANumber {
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
			System.out.println("Reverse of the digits of number " + originalNum + " is " + reverse);
		}
	}
}

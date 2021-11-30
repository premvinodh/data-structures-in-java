/**
 * <pre>
 * Name			: _15FibonacciSeriesOfNNumbers
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the first 'n' fibonacci numbers.
 * 				  the input(s) - n
 * 				  Formulae ::  (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ....)
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _15FibonacciSeriesOfNNumbers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter how many numbers:");
			int n = scanner.nextInt();

			System.out.println("Displaying the fibonacci series upto "+n+" numbers");
			int firstNum = 0;
			int secondNum = 1;
			System.out.print(firstNum + " " + secondNum + " ");
			for (int i = 0; i < n - 2; i++) {
				int nextNum = firstNum + secondNum;
				System.out.print(nextNum + " ");

				firstNum = secondNum;
				secondNum = nextNum;
			}
		}
	}
}

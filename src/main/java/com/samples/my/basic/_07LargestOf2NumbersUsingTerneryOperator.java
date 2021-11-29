/**
 * <pre>
 * Name			: _07LargestOf2NumbersUsingTerneryOperator.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept two numbers a, b and output the largest using ternary operator
 * 				  the input(s) - a, b
 * 				  Formulae :: a > b ? "A is largest" else "B is largest"
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _07LargestOf2NumbersUsingTerneryOperator {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter input for a: ");
			int a = scanner.nextInt();

			System.out.print("Enter input for b: ");
			int b = scanner.nextInt();

			int max = a>b ? a : b;
			System.out.println("Max : "+max);
		}
	}
}

/**
 * <pre>
 * Name			: _05Discriminant.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to accept the values of a,b,c of an algebraic equation and output the discriminant. 	
 * 				  the input(s) - a, b, c
 * 				  Formula: d = b*b-4*a*c
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _05Discriminant {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter input for a: ");
			int a = scanner.nextInt();

			System.out.print("Enter input for b: ");
			int b = scanner.nextInt();

			System.out.print("Enter input for c: ");
			int c = scanner.nextInt();

			int d = b * b - 4 * a * c;
			System.out.println("Discriminant :" + d);

		}
	}
}

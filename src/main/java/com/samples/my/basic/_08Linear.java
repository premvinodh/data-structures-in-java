/**
 * <pre>
 * Name			: _08Linear.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to program to accept the values a, b, c of an algrebaric equation and output 
 * 				  whether the equation is linear or not.
 * 				  the input(s) - a, b, c
 * 				  Formulae :: If a=0, then the equation is linear else not linear.
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _08Linear {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter value for a:");
			int a = scanner.nextInt();

			System.out.println("Enter value for b:");
			int b = scanner.nextInt();

			System.out.println("Enter value for c:");
			int c = scanner.nextInt();

			if (a == 0) {
				System.out.println("Algebraic equation is linear");
			} else {
				System.out.println("Algebraic equation is not linear");
			}
		}
	}
}

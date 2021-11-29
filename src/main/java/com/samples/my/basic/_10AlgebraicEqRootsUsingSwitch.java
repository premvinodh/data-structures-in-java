/**
 * <pre>
 * Name			: _10AlgebraicEqRootsUsingSwitch.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the roots of an algebraic equation.
 * 				  the input(s) - a, b, c
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _10AlgebraicEqRootsUsingSwitch {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter value for a:");
			int a = scanner.nextInt();

			System.out.println("Enter value for b:");
			int b = scanner.nextInt();

			System.out.println("Enter value for c:");
			int c = scanner.nextInt();

			int d = b * b - 4 * a * c;
			int p = -1;
			int r1 = -1;
			int r2 = -1;
			if (d == 0) {
				p = 0;
			} else if (d > 0) {
				p = 1;
			} else {
				p = 2;
			}

			switch (p) {
			case 0:
				r1 = -b / (2 * a);
				r2 = r1;
				System.out.println("Equal Roots\n");
				System.out.println("Root1 =" + r1 + ", Root2=" + r2);
				break;
			case 1:
				r1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
				r2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
				System.out.println("Real Roots\n");
				System.out.println("Root1 =" + r1 + ", Root2=" + r2);
				break;
			case 2:
				r1 = -b / (2 * a);
				r2 = (int) (Math.sqrt(-d) / (2 * a));
				System.out.println("Imaginary Roots");
				System.out.println("Root1 =" + r1 + "+i" + r2);
				System.out.println("Root1 =" + r1 + "-i" + r2);
				break;
			}
		}
	}
}

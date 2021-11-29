/**
 * <pre>
 * Name			: _04Velocity.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the values of v, s by accepting
 * 				  the input(s) - u, a, t
 * 				  Formulae :: v = u + at
 * 							  s = ut + (1/2)a*t*t
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _04Velocity {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter input for initial velocity (u): ");
			int u = scanner.nextInt();

			System.out.print("Enter input for acceleration (a): ");
			int a = scanner.nextInt();

			System.out.print("Enter input for time (t): ");
			int t = scanner.nextInt();

			int v = u + a * t;
			int s = u * t + (1 / 2) * a * t * t;

			System.out.println("\nFinal Velocity : " + v);
			System.out.println("Displacement : " + s);
		}
	}
}

/**
 * <pre>
 * Name			: _27MultiplicationTables.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the first 'n' multiplication tables. 
 * 				  the input(s) - n
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _27MultiplicationTables {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter how many tables : ");
			int n = scanner.nextInt();

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j < 12; j++) {
					System.out.println(i + "  *  " + j + " = " + (i * j));
				}
				System.out.println("\n\n");
			}
		}
	}
}

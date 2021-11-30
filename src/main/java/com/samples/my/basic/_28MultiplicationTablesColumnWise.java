/**
 * <pre>
 * Name			: _28MultiplicationTablesColumnWise.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to output the first 'n' multiplication tables. 
 * 				  the input(s) - n  (with 5 tables in each row)
 * 				  when n is a multiple of 5. 
 * 					   n is not a multiple of 5 the nearest next multiple of 5 is chosen 
 * 				  Formulae ::
 * </pre>
 */
package com.samples.my.basic ;

import java.util.Scanner;

public class _28MultiplicationTablesColumnWise {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter how many tables : ");
			int n = scanner.nextInt();

			for (int i = 1; i <= n; i = i + 5) {
				for (int j = 1; j < 12; j++) {
					System.out.print(i + "  *  " + j + " = " + (i * j));
					System.out.print("\t" + (i + 1) + "  *  " + j + " = " + ((i + 1) * j));
					System.out.print("\t" + (i + 2) + "  *  " + j + " = " + ((i + 2) * j));
					System.out.print("\t" + (i + 3) + "  *  " + j + " = " + ((i + 3) * j));
					System.out.print("\t" + (i + 4) + "  *  " + j + " = " + ((i + 4) * j));
					System.out.print("\n");
				}
				System.out.println("\n\n");
			}
		}
	}
}

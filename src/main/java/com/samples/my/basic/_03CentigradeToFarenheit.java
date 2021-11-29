/**
 * <pre>
 * Name			: _03CentigradeToFarenheit.java
 * author		: Prem Vinodh
 * version 		:
 * Description	: Develop a program to <what the program should do>
 * 				  the input(s) - <input 1, input 2, ...>
 * 				  <formula>;
 * </pre>
 */
package com.samples.my.basic;

import java.util.Scanner;

public class _03CentigradeToFarenheit {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter temperature in Centigrade");
			int temperaturInCentigrade = scanner.nextInt();

			int temperaturInFarenheit = (9 / 5) * temperaturInCentigrade + 32;
			System.out.println("Centigrade Temperature " + temperaturInCentigrade + " = Farenheit Temperature "
					+ temperaturInFarenheit);
		}
	}
}

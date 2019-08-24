package com.loopstatements;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

public class AddNumbers {

	public static void main(String[] args) {
		
		//Initializing the Scanner Object.
		Scanner scanner = new Scanner(System.in);
		
		boolean repeat;
		
		//Do While Loop
		do {
			System.out.println("Enter the first number:");
			double num1 = scanner.nextDouble();
			
			System.out.println("Enter the second number:");
			double num2 = scanner.nextDouble();
			
			double sum = num1 + num2;
			
			System.out.println("Sum of Two Numbers: " + sum);
			
			System.out.println("Do you want to repeat this again? True or False");
			
			repeat = scanner.nextBoolean();
			
		}while(repeat);
		
		scanner.close();
		
		
	}
	
}

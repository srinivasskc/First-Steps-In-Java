package com.classes;  //Package Declaration

import java.util.Scanner; // Scanner Import

public class GrossPayCalculator {  //Class Declaration
	
//package, public, class = Reserved Keywords in Java. So they are in different color.
	
	//Block of code
	
	public static void main(String[] args) {
		//Default Method in Java. 
		//When we execute the class, it starts from Main Method.
		
		
		/*
		 * Algorithm:
		 * Get the number of hours worked
		 * Get the hourly pay rate
		 * Multiply hours and pay rate
		 * Display Result
		 */
		
		//Code: Get No. of Hours Employee Worked
		System.out.println("Enter the Number of Hours Employee Worked:");
		//Statement ends with semi-colon.
		
		Scanner scanner = new Scanner(System.in); //Data is inputed to Scanner class object.
		int hours = scanner.nextInt();  //Variable Declaration
		
		
		//Code: Get Hourly Pay Rate.
		System.out.println("Enter Hourly Pay Rate:");
		//Scanner scanner1=new Scanner(System.in);
		double payRate = scanner.nextDouble();
		
		scanner.close(); // When we use scanner, we need to close it to free up the memory. We write it after lasts scanner statement.
		
		
		//Code: Multiply Hours and Pay Rate
		double grossPay = hours * payRate;
		
		//Code: Display the Results
		System.out.println("Employee's Gross Pay is: $"+grossPay);
	}
	
	
	
}

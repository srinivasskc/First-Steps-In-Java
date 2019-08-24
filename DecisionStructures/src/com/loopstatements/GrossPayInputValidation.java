package com.loopstatements;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

public class GrossPayInputValidation {

	public static void main(String[] args) {
		
		//Initializing Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Get Values of Employee Rate
		int rate = 15;
		int maxHours = 40;
		
		//Get Input values of the Employee Worked
		System.out.println("Enter the No. of Hours Employee worked: ");
		double hoursWorked = scanner.nextDouble();
		
		//Validating the Input
		
		while(hoursWorked > maxHours || hoursWorked < 1)
		{
			System.out.println("Incorrect Input. Enter correct hours worked again");
			hoursWorked = scanner.nextDouble();
		}
		
		//Scanner Close
		scanner.close();
		
		//Get Gross Salary
		double gross = rate * hoursWorked;
		
		//Print output of Gross Salary of Employee.
		System.out.println("Gross Salary of Employee for the week is: Rs." + gross);
		
	}
	
	
}

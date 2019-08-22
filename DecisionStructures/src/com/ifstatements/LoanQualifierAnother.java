package com.ifstatements;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

public class LoanQualifierAnother {
	
	public static void main(String[] args) {
		
		//Instantiating Scanner Object.
		Scanner scanner = new Scanner(System.in);
	
		double salaryRequired = 30000;
		double experienceRequired = 2; 
		
		System.out.println("Enter the Salary of the Person:");
		double salary = scanner.nextDouble();
		
		System.out.println("Enter the years of experience at current Job:");
		double yearsExperience = scanner.nextDouble();
		
		//Always close the scanner object.
		scanner.close();
		
		//Decision Making and Displaying the output.
		if(salary>=salaryRequired && yearsExperience>= experienceRequired) 
			{	
			System.out.println("You are qualified for the loan");
			}
			else 
			{
			System.out.println("Sorry, you must have atleast " + experienceRequired +" years experience. Or you must have atleast $ " + salaryRequired + " salary. You are not qualified for the loan");
			}
	}
}
package com.variables;

import java.util.Scanner;

public class InstantCreditCheck {

	//Initialize What we Know - Globally
	
	static int salaryRequired = 25000;
	static int creditScoreRequired = 700;
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		//Get what we dont know
		double actualSalary = getActualSalary();
		int actualCreditScore = getActualCreditScore();
		
		//scanner close
		scanner.close();
		
		//check if user is qualified 
		boolean qualified = isUserQualified(actualSalary,actualCreditScore);
		
		//notify the user
		notifyUser(qualified);
		
		
	}
		
	//Get Actual Salary
	public static double getActualSalary() {
		System.out.println("Enter the Actual Salary: ");
		double actualSalary = scanner.nextDouble();
		return actualSalary;
		
	}
	
	//Get Actual Credit Score
	public static int getActualCreditScore() {	
		System.out.println("Actual Credit Score: ");
		int actualCreditScore = scanner.nextInt();
		return actualCreditScore;
	}
	
	
	//Check isUserQualified?
	public static boolean isUserQualified(double actualSalary, int actualCreditScore){
		if(actualCreditScore >= creditScoreRequired && actualSalary >= salaryRequired) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Notify User
	public static void notifyUser(boolean isQualified)
	{
		if(isQualified) {
			System.out.println("Congratualtions. Loan is approved");
		}
		else
		{
			System.out.println("Sorry, It is declined");
		}
	}
}

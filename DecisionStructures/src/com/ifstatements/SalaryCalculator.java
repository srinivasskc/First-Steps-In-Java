package com.ifstatements;

import java.util.Scanner;

/*
 * Using If Statement
 * 
 * Problem: All salespeople get $1000 a week.
 * salespeople who exceeds 10 sales get an additional bonus of $250.
 */

public class SalaryCalculator {

	public static void main(String[] args) {
		//Initialize known values
		int salary = 1000;
		int bonus = 250;
		int quota = 10;
		
		//Get unknown values
		System.out.println("How many sales did Salesperson did this week:");
		
		Scanner scanner = new Scanner(System.in); 
		int Sales = scanner.nextInt();
		
		scanner.close(); // Closing the scanner
		
		//Check for bonus earners with hard-coded value
		/*if(Sales>10) {
			salary = salary + bonus;
		}*/
		
		//Check for bonus earners with variable name
		if(Sales>quota) {
					salary = salary + bonus;
		}
				
		
		
		//output salary
		System.out.println("Salary of Salesperson this week is $" + salary);
	}
}

package com.ifstatements;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulations message.
 * For those who don’t, they are informed of how many sales they were short.
 */

public class QuotaCalculator {

	public static void main(String[] args) {
		
		int quota = 10;
		
		//Initializing Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Get the values from user
		System.out.println("How many sales did sales person did this week:");
		int sales = scanner.nextInt();
		scanner.close();
		
		//Decision Making Structures and print the output.
		if (sales>=quota)
		{
			System.out.println("Congratulations!, you have met the sales quota");
		}
		else {
			int salesShort = quota-sales;
			System.out.println("You did not meet the quota. You were " + salesShort + " sales short");
		}		
	}
}

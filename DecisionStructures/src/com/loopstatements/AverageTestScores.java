package com.loopstatements;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 * Students = 24
 * Tests = 4
 */

public class AverageTestScores {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		int students=24;
		int tests = 4;
		
		
		
		for(int i=0; i<students; i++)
		{

			double total = 0;
			System.out.println("----- Test Scores for Student "+ (i+1)+ " -----");
			for(int j=0;j<tests;j++) 
			{
				System.out.println("Enter the Scores for the Test#" + (j+1));  //0-20 ; 1 - 30 ; 2 - 40 ; 3 - 50
				double score =  scanner.nextDouble();
				total = total + score; //20 - 50 - 90 - 140
			}	

			System.out.println("Total score of students is "+ total);
			double average = total/tests;
			System.out.println("Average score of Student # " + (i+1) + " is: " + average + "\n");
		}
		scanner.close();
			
	}
}

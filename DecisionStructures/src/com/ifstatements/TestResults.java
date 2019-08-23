package com.ifstatements;

import java.util.Scanner;  //Imported Java Util Scanner

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

public class TestResults 
	{

		public static void main(String[] args) 
		
		{
		
		//Initializing the Scanner Object.
		
		Scanner scanner = new Scanner(System.in);
		
		//Getting the Test Score from User
		System.out.println("Enter the Test Score of the Student:");
		double score = scanner.nextDouble();
		scanner.close();
		
		//Determine the Grade of Student
		
		char grade;
		
		//Decision Making - Score vs Grade
		if(score<40)
		{
			grade='F';
		}
		else if(score >= 40 & score <50)
		{
			grade='E';
		}
		else if(score >=50 & score <60)
		{
			grade ='D';
		}
		else if(score >=60 & score <70)
		{
			grade = 'C';
		}
		else if(score>=70 & score < 80)
		{
			grade = 'B';	
		}
		else if(score>=80 & score <90)
		{
			grade = 'A';
		}
		else if(score>=90 & score <=100)
		{
			grade = 'I'; //Intelligent
		}
		else
		{
			grade ='N'; //Not Present
		}
		
		System.out.println("Grade of the Student is: " + grade);
		}
}

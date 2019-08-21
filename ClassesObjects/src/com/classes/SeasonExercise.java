package com.classes;

import java.util.Scanner;

public class SeasonExercise {
	
	public static void main(String[] args) {
		
		//Creating a Scanner object to take the data - Opening the Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Enter Season of Year = Seasons will be in String Format
		System.out.println("Enter the Season of the Year:");
		String season = scanner.next(); //String

		
		//Enter Whole Number - No. of Cups of Coffee
		System.out.println("Enter the Whole Number:");
		int wholeNumber = scanner.nextInt(); //integer
		
	
		//Enter an Adjective - Adjective for Season will be in String format.
		System.out.println("Enter an Adjective:");
		String adjective = scanner.next(); // String
		
		//Closing the Scanner
		scanner.close();
		
		//Forming the Sentence
		System.out.println("On a " +adjective + " " + season + " " + "day, I drank a minimum of " + wholeNumber + " " + "cups of coffee.");
	}

}

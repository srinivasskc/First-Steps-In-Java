package com.switchstatements;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

public class GradeMessageFallThrough {

	public static void main(String[] args) {
		//Initializing Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Get the Values of Grade from User
		System.out.println("Enter the Grade of the Student:");
		String grade = scanner.next(); //Scanner does not have Char Method. So, we are using Next - String.
		//Closing the Scanner Object
		scanner.close();
		
		//Switch Statements
		
		String message;
		
		switch(grade)
		{
			case "I":
				message = "Intelligent";
				//break;  
				
				/*
				 * "Switch Fall Through":  When you enter grade as I: It will skip the message and
				 *  Go to A message and displays it. 
				 */
				
			case "A":
				message="Excellent";
				break;
			
			case "B":
				message="Great";
				break;
				
			case "C":
				message="Good";
				break;
			
			case "D":
				message="Average";
				break;
				
			case "E":
				message="Below Average";
				break;
				
			case "F":
				message="Fail";
				break;
			
			case "N":
				message="Not Present";
				break;
			
			default:
				message="Invalid Grade";
				break;
		}
		
		System.out.println("You have been awarded: "+ message);	
	}
}
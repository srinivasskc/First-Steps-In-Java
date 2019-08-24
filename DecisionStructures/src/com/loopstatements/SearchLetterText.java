package com.loopstatements;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */

public class SearchLetterText {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//Get the text from the user
		System.out.println("Enter the text:");
		String text = scanner.next();  //Krishna
		
		boolean letterFound = false;
		
		for(int i=0; i<text.length();i++)
		{
			char currentLetter = text.charAt(i);
			
			if(currentLetter=='A' || currentLetter=='a')
			{
				letterFound=true;
				break;
			}
			
		}
		
		if(letterFound)
		{
			System.out.println("The text contains letter 'A' ");
		}
		else {
			System.out.println("The text does not contain letter 'A' ");
		}
		
		scanner.close();
	}
	
	
}

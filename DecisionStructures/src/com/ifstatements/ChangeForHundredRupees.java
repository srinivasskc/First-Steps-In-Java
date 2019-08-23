package com.ifstatements;

import java.util.Scanner;

public class ChangeForHundredRupees {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int oneRupee = 1;
		int twoRupee = 2;
		int fiveRupee = 5;
		int tenRupee = 10;
		int twentyRupee = 20;
		int fiftyRupee = 50;
		
		int hundredRupee=100;
		
		System.out.println("Welcome to 'Change for a Hundred Rupees'! " +
                "Your goal is to enter enough change to make exactly Rs.100");
		
		 
		System.out.println("Enter No. of One Ruppes");
		int numOfOneRs = scanner.nextInt();
		
		System.out.println("Enter No. of Two Rupees");
		int numOfTwoRs = scanner.nextInt();
		
		System.out.println("Enter No. of Five Rupees");
		int numOfFiveRs = scanner.nextInt();
		
		System.out.println("Enter No. of Ten Rupees");
		int numOfTenRs = scanner.nextInt();
		
		System.out.println("Enter No. of Twenty Rupees");
		int numOfTwentyRs = scanner.nextInt();
		
		System.out.println("Enter No. of Fifty Rupees");
		int numOfFiftyRs = scanner.nextInt();
		
		scanner.close();
		
		int total = numOfOneRs * oneRupee + numOfTwoRs * twoRupee + numOfFiveRs * fiveRupee + numOfTenRs * tenRupee + numOfTwentyRs * twentyRupee + numOfFiftyRs * fiftyRupee;
		
		if (total < hundredRupee)
		{
			int amountShort = hundredRupee - total;
			
			System.out.println("Sorry, you are short by " + amountShort + " Rs. for change");
		}
	   else if (total > hundredRupee) 
	   {
		   int amountExcess = total - hundredRupee;
		   
		   System.out.println("Great, But you have excess ammount of " + amountExcess + "Rs. for change");
	   } 
	   else {
		
		   System.out.println("Yay, you have exact Rs.100 change");
		}
		
		
		
		
		
		
		
	}
}

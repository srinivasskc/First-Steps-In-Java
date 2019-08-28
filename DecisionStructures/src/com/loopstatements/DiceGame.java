package com.loopstatements;

import java.util.Random;

public class DiceGame 
{
			public static void main(String[] args) {
				
				int maxSpaces = 20;
				int maxDiceRolls = 5;
				int currentSpace = 0;
				
				System.out.println("Welcome to the Dice Game. Let's Begin....!!");
				
				Random random = new Random();
				
				for(int i=1;i<=maxDiceRolls;i++)
				{
					
		System.out.println("You have rolled Dice: " + i);
					int dice = random.nextInt(5)+1; //nextInt(int bound)
					//In Dice we dont have zero, so if we get zero. it would be added by 1.
					
					
					currentSpace = currentSpace + dice;
		System.out.println("You have got count on dice: " + dice);
		System.out.println("And Your current Space is : " + currentSpace + "\n");
		 
		if(currentSpace==maxSpaces)
		{
			System.out.println("You are on " + currentSpace + " Yay, you have won the game");
		}
		else if(currentSpace > maxSpaces)
		{
			System.out.println("You are on "+currentSpace + ". space");
			System.out.println("Unfortunately, you have completed " + maxDiceRolls + " Max Dice Rolls. Please Retry again.");
		}
		else if(i==maxDiceRolls && currentSpace < maxSpaces)
		{
			System.out.println("You are on "+currentSpace + " space \n");
			
			System.out.println("Unfortunately, you did not complete all " + maxSpaces + " spaces." + " Please Retry again.." );
		}
		
	}
				
	}
}

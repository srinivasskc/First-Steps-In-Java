package com.loopstatements;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

public class CashPayment {

	public static void main(String[] args) {
		
		//Initializing Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * First Cashier will ask No. of Items
		 * Then It takes each items cost
		 * Cost is added to the total (Temporarily)
		 * Until all items are scanned, final total is not derived.
		 * Once Done, Final Total is resulted.
		 */
		
		
		System.out.println("Enter No. of Items to scan for billing: ");
		int quantityOfItems = scanner.nextInt();
		
		double total = 0;
		
		//Creating a loop to iterate all quantity of items.
		
		for(int i=0; i<quantityOfItems; i++) 
		{
			System.out.println("Enter the Cost of the Item:");
			double cost = scanner.nextDouble();
			
			total = total + cost;
			
		}
		
		System.out.println("Final Cost of All Items: Rs." + total);
		
		scanner.close();
		
	}
}

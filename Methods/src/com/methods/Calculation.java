package com.methods;

import java.util.Scanner;

public class Calculation{
	
	public static void main(String[] args) {
		
		System.out.println("Enter Value for Num1: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		
		System.out.println("Enter value for Num2: ");
		int num2 = scanner.nextInt();
		calculateSum(num1, num2);		
		scanner.close();
	}

	public static int calculateSum(int num1, int num2)
	{
		int sum = num1+num2;
		System.out.println("Sum: " + sum);
		return sum;		
	}

}

package com.methods;

import java.util.Scanner;

public class Greetings {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the name of User: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		greetUser(name);
		
		scanner.close();
	}
	
	public static void greetUser(String name) {
		System.out.println("Hello, Good Morning " + name);
		
	}

}

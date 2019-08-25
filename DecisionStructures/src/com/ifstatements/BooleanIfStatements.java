package com.ifstatements;

public class BooleanIfStatements {
	
	public static void main(String[] args) {
		
		boolean b = true;
		// true is assigned to b
		
		if(b)
		{//if true, this is executed. If conditions execute only when condition or value is true.
		System.out.println("This is executed");
		}
		
		b = false;
		if(b)
		{//This is not executed in If condition.
		System.out.println("This is not executed");
		}
	}
}

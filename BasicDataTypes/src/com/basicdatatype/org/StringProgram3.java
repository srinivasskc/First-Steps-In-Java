package com.basicdatatype.org;

public class StringProgram3 {
	
	public static void main(String[] args) {
		
		//String as Object.
		String s = new String("Learning Strings");
		System.out.println(s);
	
	//String Concatenation
	String firstName = "John";
	String lastName = "Gresham";
	String fullName = firstName + " " + lastName;
	System.out.println(fullName);
	System.out.println("FullName: "+ firstName + " " + lastName);
	
	//String Concat Method
	System.out.println(firstName.concat(lastName));

//If you add two numbers, the result will be a number:
	int s1 =10;
	int s2 = 20;
	System.out.println(s1+s2);

//If you add two strings, the result will be a string concatenation:
	String s3="10";
	String s4="20";
	System.out.println(s3+s4);
	
//If you add a number and a string, the result will be a string concatenation:
	String s5="30";
	int s6=30;
	System.out.println(s5+s6);
	
	
	}
	

}

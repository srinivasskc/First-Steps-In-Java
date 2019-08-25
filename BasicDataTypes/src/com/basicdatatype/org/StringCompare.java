package com.basicdatatype.org;

public class StringCompare {
	public static void main(String[] args) {
		
		//Comparing the Values.
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s1.equals(s2)); //boolean = false
		
		s2=s2.replace("h", "H");
		System.out.println(s1.equals(s2)); //boolean = true
		
		String s3="HELLO";
		System.out.println(s1.equalsIgnoreCase(s3)); //boolean = true
		
		//Comparing the Memory location of s1 and s3.
		System.out.println(s1 == s3); //boolean = false
		
		//Negation of equals
		System.out.println(s1.equals(s2)); //currently it is true.
		System.out.println(!s1.equals(s2)); // boolean = false
		
	}
}

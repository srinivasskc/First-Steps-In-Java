package com.basicdatatype.org;

public class DataTypes {
	
// Do programs on each of the data types to accept and print some valid values.
	
	
	public static void main(String[] args) {

		byte a=100;
		System.out.println("Value of Byte - a: "+ a);
		//Byte stores: -128 to 127

		
		//short c = -200000;
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 * Type mismatch: cannot convert from int to short
		 * at com.basicdatatype.org.DataTypes.main(DataTypes.java:13)
		 */
		
		//System.out.println("Value of c: "+c);
		
		short b = 20;
		System.out.println("Value of short - b: "+ b);
		
		int c=-10;
		//int stores: -2,147,483,648 to 2,147,483,647
		System.out.println("Value of int - c: "+c);
		
		long d = 9223372036854775807L;
		//long stores: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.println("Value of long - d: "+d);
		
		float e=10.123f;
		//Stores 6 to 7 decimal digits
		System.out.println("Value of float - e: "+e);
		
		double f=100000.1234567891234567890;
		//Stores 15 decimal digits
		System.out.println("Value of double - f: "+f);
		
		double F=100000.123456789123d;
		//Stores 15 decimal digits
		System.out.println("Value of double - F: "+F);
		
		boolean g=false;
		//Stores true or false values
		System.out.println("Value of boolean - g: " +g);
		
		boolean G=true;
		//Stores true or false values
		System.out.println("Value of boolean - G: " +G);
		
		char h = 100;
		//Stores a single character/letter or ASCII values
		System.out.println("Value of Char - h :" +h);
		
		char i = 'i';
		System.out.println("Value of char - i :" +i);
		
	}
}

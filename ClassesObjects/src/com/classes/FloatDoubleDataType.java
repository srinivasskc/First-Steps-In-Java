package com.classes;

public class FloatDoubleDataType {
	
	public static void main(String[] args) {
		
		//Float vs Double.
		float speedOfCar = 100.12f;
		System.out.println("Speed of Car: " + speedOfCar+ " km/hr");
		
		double speedOfBus = 110.1;
		System.out.println("Speed of Bus: " + speedOfBus+ " km/hr");
		
		//How many digits float and double can store?
		float countFloat = 12345.12345f;
		System.out.println("How many digits float can store: " + countFloat);
		//12345.123
		

		double countDouble = 123456789.123456789;
		System.out.println("How many digits double can store: " + countDouble);
		//1.23456789123456789E8
		
		double countDouble1 = 1234567.1234567890;
		System.out.println("How many digits double can store: " + countDouble1);
		//1234567.123456789
		
		
		

		//Float without 'f'
		//float speedOfCar1 = 100.12;
		System.out.println("Speed of Car: " + speedOfCar+ " km/hr");
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 * Type mismatch: cannot convert from double to float
		 * at com.classes.FloatDoubleDataType.main(FloatDoubleDataType.java:32)
		 */
		
		
		
	}

}

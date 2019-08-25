package com.classes;

public class LightDistanceTravel {
	
		public static void main(String[] args) {
			
			long lightSpeed = 186000;
			long days =1000;
			
			long seconds = days * 24*60*60;  //
			long distance = lightSpeed*days*seconds;
			
			System.out.println("In " +days + " days, Distance of Light Travel: "+distance);
			
			
			
		}
	
}

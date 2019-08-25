package com.basicdatatype.org;

public class StringProgram2 {
	public static void main(String[] args) {

//A String in Java is actually an object, 
//which contain methods that can perform certain operations on strings.


//Length of the String.		
String s = "Unveiling the Green Life";
System.out.println("Length of the String is: "+ s.length());
//It includes spaces in between.


//Convert Text to Upper and Lower Case
String s1 = "Green Woods";
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());

//Finding the String inside the String.
String s2 = "Green is the energy of nature with boundless energy";
System.out.println(s2.length());
System.out.println(s2.indexOf("energy"));
//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):


//Replacing the Characters/String Values. - Method: Replace()
String s3 = "Points and Rewards Program";
//s3 = s3.replace("a", "A"); //Replace oldchar with newchar
//System.out.println(s3);
s3 = s3.replace("and", "&"); //Replace sequence of characters 
System.out.println(s3);

String s4 = "Hello, Hello, I am Commander ABC.. Hello, Hello";
System.out.println(s4.replace("Hello", "Hi"));



//Method: substring()
String s5 = "Children's play area";
System.out.println(s5.substring(11));
System.out.println(s5.substring(0, 15));





		
		
		
	}

}

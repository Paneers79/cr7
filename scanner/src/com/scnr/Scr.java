package com.scnr;

import java.util.Scanner;

public class Scr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ur name");
		
		String name = sc.next();
		System.out.println("my name is "+ name);
		
		System.out.println("My birth year");
		
		int dob = sc.nextInt();
		System.out.println("Birth year is"+ dob);
		
		System.out.println("my weight");
		double pound = sc.nextDouble();
		System.out.println("Weight is"+ pound);
		
		System.out.println("my age");
		byte age = sc.nextByte();
		System.out.println("age is"+age);
		
		System.out.println("name1");
		String name1 = sc.next();
		System.out.println("name  is "+name1);

	}

}


  // definition
  //(Java Scanner class is part of the java. util package which 
   //is mostly used to receive user input and parse them into primitive data types 
   //such as int, double or default String.
 //* How to get Java Scanner)
//*To get the instance of Java Scanner which reads input from the user,
//*we need to pass the input stream (System.in) in the constructor of Scanner class.
//For Example:

//Scanner in = new Scanner(System.in);  


//To get the instance of Java Scanner which parses the strings, we need to pass the strings in the constructor of Scanner class.
//For Example:

//*Scanner in = new Scanner("Hello Javatpoint");  */
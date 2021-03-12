package com.class02;

public class PracticeWithOperators {

	public static void main(String[] args) {
		
	// 1 Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

		
		double num1 = 3.5;
		double num2 = 20.5;
		double sumOfNumbers = num1 + num2;
		double subOfNumbers = num1 - num2;
		double productOfNumbers = num1 * num2;
		double devOfNumbers = num1 - num2; 
		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sumOfNumbers);
		
		
		
		// 2 Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”
		 double num3 = 3.9;
		 double square = num3 * num3;
		 System.out.println("The square of the " + num3 + " is " + square);
		 
		 
		 
		 // 3 Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		 //Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
		 
		 
		 
		 int width = 5;
		 int height = 8;
		 int per = (width *2) + (height * 2);
		 int area =width * height;
		 
		 System.out.println("The perimeter of a rectangle with width " + width + " and " + height + " is equal to " + per + " and the area is " + area );
		
		
		
	}

}

package com.class05LogicalOp;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and logical operators provided by a
		 *  user (numbers must be distinct)

		 */
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, largest;

		System.out.println("Enter your first number");
		num1 = scan.nextDouble();
		
		System.out.println("Enter your second number");
		num2 = scan.nextDouble();
		
		System.out.println("Enter your third number");
		num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			largest = num1;
		}else if(num2 > num1 && num2 > num3) {
			largest = num2;
		}else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest );
		
		System.out.println("======================");
		/*
		 * Write a program to find largest number among three numbers using nested if provided by 
a user (numbers must be distinct)
		 */
		
		if(num1>num2) {
			if(num1>num3) {
				largest = num1;
			}
		}else if(num2>num1) {
			if(num2>num3) {
				largest = num2;
			}
		}else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest);
	}

}

package com.class05LogicalOp;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
             short (under 60 inch)
              medium(between 60 -72 inch)
               tall (over 72 inch)*/
		
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your height");
		double height = scan.nextDouble();
		
		
		
		if(height <= 60) {
			System.out.println("Short");
		}else if(height > 60 && height < 72 ) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
		
		/*Write a program that will print whether it is a weekend or weekday. 
		If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output 
		“It is a weekend”, any other day → output “Invalid day”
				 */
		
		System.out.println("Enter your day");
		int day = scan.nextInt();
		
		if(day >= 1 && day <= 5) {
			System.out.println("It is week day");
		}else if(day == 6 || day == 7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}

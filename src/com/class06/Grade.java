package com.class06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 *  At the end your program should print which grade was entered by a user with explanation.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade please");
		char grade = scan.next().charAt(0);
		String expl= "null";
		
		 switch (grade) {
		 case 'A':
			 expl = "Excellent";
			 break;
			 
		 case 'B':
			 expl = "Good";
			 break;
			 
		 case 'C':
			 expl = "Average";
			 break;
			 
		 case 'D':
			 expl = "Bad";
			 break;
			 default:
				 expl = "Not Acceptable";
				 
		 }
		 System.out.println("your grade is " + expl);
		
		
		

	}

}

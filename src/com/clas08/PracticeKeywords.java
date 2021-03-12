package com.clas08;

import java.util.Scanner;

public class PracticeKeywords {

	public static void main(String[] args) {
		
		 /* Print numbers from 1 to 50 except those that are divisible by 3 */
		
		for(int i =1; i <=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("-------------------------------");
		/*
		 * Create a program that will keep asking user to apply for a credit card.
 As soon you get “yes” from a user program should stop asking.
		 */
	
		Scanner scan = new Scanner(System.in);
		
		
		String str = "yes";
		do {
			System.out.println("Do you want to aplay for credit card?");
			str= scan.next();
			
		}while(!str.equals("yes"));
		System.out.println("No more questions");
	
	}

}

package com.class7Loops;

import java.util.Scanner;

public class NextExample {

	public static void main(String[] args) {
		/*
		 * we need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more than 3 --- please give less money
		 * if user gives less than 3 ----- please give me more money
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.println("Please enter your money");
		
		do{
			
					num=scan.nextInt();
					if(num<3) {
						
						System.out.println("Please give mre more money");
						
					}else if(num>3) {
						System.out.println("Please give me less money");
						
					}
					}while(num!=3);
		
		System.out.println("Just right!");
		
			
		System.out.println("================while======================");
		
		System.out.println("Please enter your money");
		num=scan.nextInt();
		
		while(num!=3) {
			
			if(num<3) {
				
				System.out.println("Please give mre more money");
			}else if(num>3) {
				
				System.out.println("Please give me less money");
		}
			num=scan.nextInt();
		
		

	}
		System.out.println("Thanks for your purchase");
	}}



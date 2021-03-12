package com.clas08;

import java.util.Scanner;

public class PrecticeLoops {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers 
		 * (start and end point), provided by a user and then from that range prints 
		 * the sum of the even and odd integers.
		 */
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter starting point number");
		int start= scan1.nextInt();
		
		System.out.println("Please enter ending point number");
		int end=scan1.nextInt();
		
		int sumOfEven=0 ;
		int sumOfOdd=0;
		
		
		if(start<end) {
			
		for(int i = start; i<=end; i++) {
			
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
		}
		System.out.println("Sum of even numbers from  " + start+ " to " + end+" is = " + sumOfEven);
		System.out.println("Sum of odd numbers equal to "+start+ " to " + end+" is = " + sumOfEven);
	
		
		}
		}
			

}
package com.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/* #1.
		 You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you need to get loan for");
		double amount = sc.nextDouble();
		
		if(amount<=200_000) {
			System.out.println("You are aproved for this amount, you can getva loan");
		}else {
			System.out.println("Sorry but we have to reject your loan");
		}
		System.out.println("==========================================");
		
		/*
		 You are DMV representative and you need to ask customer their age. 
		 If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		 */
		
		 System.out.println("Welcome to DMV of Chicago! Please, enter your age");
		 int age = sc.nextInt();
		 
		  if(age>=18) {
			  System.out.println("You are eligible to get your ");
		  }else {
			  System.out.println("Firs you need to get lerners permit");
		  }
		
		
	}

}

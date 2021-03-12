package com.clas08;

import java.util.Scanner;

public class Shoping {

	public static void main(String[] args) {
		/*
		 * 
Write a program to ask a user to enter item they want to buy and the price of that item. 
Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
If user give more money program should return a change. 
Whenever a user done with payments program should say “Thank you for shopping!”

		 */
		
		Scanner scan = new Scanner(System.in);
		String item;
		int price;
		int money = 0;
		int sum=0;
		int remainder;
		
		System.out.println("Please enter the item you want to buy");
		item=scan.nextLine();
		
		System.out.println("Please enter the pricec" + item);
		price=scan.nextInt();
		System.out.println("Please pay for " + item);
		
		do {
			
		money=scan.nextInt();
		sum+=money;
		
		if(sum<price) {
			remainder=price-sum;
			
			System.out.println("Please give " + remainder);
			
		}else if(sum>price) {
			remainder=sum-price;
			System.out.println("Here is your change "+ remainder);
			break;
			
		}else {
			System.out.println("Just right!");
		}
		
		
	}while(price!= sum);
		System.out.println("Thanks for shopping");

}}
package com.class7Loops;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * We play lottery we have a win number which is 17.
		 * We need to keep asking a user to enter any number from 1 to 100.
		 * Until correct number is entered
		 */
		Scanner scan = new Scanner(System.in);
		int number;
		int LotteryNum = 17;
		 
		do {
			System.out.println("Please enter vany number from 1 to 100 ");
			number=scan.nextInt();
			
		}while(number!=LotteryNum);
		
		System.out.println("Congrats, you von!!!");

	}

}

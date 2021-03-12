package com.class7Loops;

import java.util.Scanner;

public class LOtteryWithWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=0;
		int LotteryNum = 17;
		System.out.println("Please enter any number from 1 to 100 ");
		number=scan.nextInt();
		
		while(number!=LotteryNum) {
			System.out.println("Please enter any number from 1 to 100");
			number=scan.nextInt();
		}
		System.out.println("Congrats you won");
	}

}

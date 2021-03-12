package com.class04;

import java.util.Scanner;

public class AnotherDemoWithScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int num1 = input.nextInt();
		
		System.out.println("Enter your secont number");
		int num2 = input.nextInt();
		
		if(num1>num2) {
			System.out.println("number one is bigger");
		}else {
			System.out.println("number two is biger");
		}
		

	}

}

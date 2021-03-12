package com.class04;

import java.util.Scanner;

public class DemoClassScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("What is your age");
		int age = scan.nextInt();
		System.out.println("Nice to meet you " + name + " " +age + " years old");
		
		System.out.println("How have you been?");
		String mood = scan.nextLine();
		

		
	}

}

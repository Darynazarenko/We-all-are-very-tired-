package com.class7Loops;

import java.util.Scanner;

public class Task01 {
	

	/*
	 * Print numbers from 1 to 100 in 1 line with space


Print numbers from 100 to 1


Print even numbers from 20 to 100

	 */
	public static void main(String[] args) {
	
	int num = 1;
	
	while(num<100) {
		System.out.print(num + " ");
		num++;
	}
	System.out.println("================================");
	 
	int num1 = 100;
	while(num1>=1) {
		System.out.print(num1 + " ");
		num1--;
	}
	System.out.println("========================");
	
	int num2 = 20;
	while(num2<100) {
		System.out.print(num2 + " ");
		num2+=2;
	}
	int num3= 20;
	while(num3<=100) {
		if(num3%2==0)
		System.out.println(num3 + " ");
		num3++;
	}
	System.out.println("===========================");
	/*
	 * I want to capture your name 5 times
	 */
	Scanner scan;
	scan =new Scanner(System.in);
	String name;
	int q =5;
	
	while(q<=10) {
	
	System.out.println("Please enter your name");
	name=scan.nextLine();
	System.out.println("Hello " +name);
	q++;
	}
	
	
	

}}

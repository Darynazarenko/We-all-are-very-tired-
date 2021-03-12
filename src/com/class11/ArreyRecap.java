package com.class11;

import java.util.Scanner;

public class ArreyRecap {

	public static void main(String[] args) {
	/*
	 * we want to create an array thet will store elements from user 
	 */
		
		Scanner scan;
		
		String[] array;
		
		scan=new Scanner(System.in);
		
		System.out.println("How many String elements would you like to store");
		int size=scan.nextInt();
		
		array=new String[size];
		
		
		for(int i=0; i<size; i++ ) {
			System.out.println("Please enter astring");
			array[i]=scan.next();
		
		}
		
		System.out.println("lets see our values-----------");
		for(String e:array) {
			System.out.println(e);
		}
		
	}

}

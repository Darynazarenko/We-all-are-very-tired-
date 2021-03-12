package com.class11;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		/*
		 * Cteate an array on double values using scanner
		 * calculate the sum of all stored elements in that arrey
		 */
		Scanner scan = new Scanner(System.in);
		double sum=0;
		System.out.println("Please enter the size of array");
		int size= scan.nextInt();
		double[] alements= new double[size];
		
		for(int i=0; i<size; i++) {
			alements[i]=scan.nextDouble();
			sum+=alements[i];
		}
		System.out.println("the sum of " +size+" elements feom user is " +sum);
		System.out.println("------ calculating sum using for each--------");
		
		sum=0;
		
		for(double num: alements) {
			sum+=num;
		}
		
		System.out.println("the sum of " +size+" elements feom user is " +sum);
		}		

	}



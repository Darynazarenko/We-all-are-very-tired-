package group.project;

import java.util.Scanner;

public class Task7 {

	
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
	

		public static void main(String[] args) {

			int[] a = {12, 15, 11, 13, 9, 25};
			int[] a2 = {12, 15, 11, 13, 9, 25};
			int sum = 0;
			for (int i = 0; i <a.length; i++) {
			         if (a[i] % 2== a2[i ] % 5)  {
			                  sum += i * i;
			         }
			}
			System.out.println("sum = " + sum);
			}

			}
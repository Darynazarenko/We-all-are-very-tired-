package com.class10;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		int[] numbers={10, 23, 2, 4, 7};
		int sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		System.out.println("Sum of all numbers =  " +sum);
		
		System.out.println("-----Sum using For Each-------------");
		int sum1=0;
		for(int n:numbers) {
			sum1=sum1+n;
		}
		System.out.println("Sum of array elements is "+ sum1);
			
		

	}

}

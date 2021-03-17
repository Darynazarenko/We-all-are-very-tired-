package com.com13;

public class MoreExamples {
	/*
	 * create a method that does not take any values and always return String hi
	 */

	String print() {
		return"hi";
		
		
		
		/*
		 * create a method that takes a number and returns the double of that number
		 */
	}
	double doubleTheValue(double input) {
		return input*2;
	}
	/*
	 * create a method that takes a boolean as input
	 * if the value is true i want to print take the umbrealla
	 * and if the value is false print please go for a walk
	 */
	
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbreala");
		}else {
			System.out.println("Go for a walk");
		}
	}
	/*
	 * create the method that prints " bathch 9 is great" 5 times
	 */
	void str() {
		for(int i=0; i<5; i++) {
			System.out.println("Batch 9 is great");
		}
	}
	/*
	 * create a method that takes 2 numbers as input and return the greater number
	 */
	int  greaterNum(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	/*
	 * create a method that takes a num and if number is even print num is even 
	 * otherwise print number is odd
	 */
	
	void number(int num) {
		if(num%2==0) {
			System.out.println(" Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}
	/*
	 * write a method that takes an array and returns the sum of he elements 
	 * that are present in array
	 */
	
	double returnTheArray(double[] arr) {
		double sum=0;
		for(double element: arr) {
			sum=sum+element;
		}
		return sum;
		
	}
	/*write a methd that returns true if a string is a mirror of itself 
	 * otherwise it return false
	 * aba -- yes
	 * bbb -- yes
	 * bba -- no
	 */
	
	
    
     
    boolean isPalindrome (String str) {
    	String newStr=" ";
    	
    	for(int i= str.length()-1; i>=0; i--) {
    		System.out.println(i+ " " + str.charAt(i));
    		newStr+=str.charAt(i);
    	}
    	System.out.println(newStr);
    	
    	if(str.equals(newStr)) {
    		
    		return true;
    	}else {
    		
    	return false;
    }
    
     
    }
    }
   
	
	



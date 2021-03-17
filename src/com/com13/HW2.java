package com.com13;

public class HW2 {
	/*
	 * Write a method to return whether given number is prime or not?
	 */
	
	boolean isPrime(int n) {
		if(n>1) 
			

		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}else {
			return false;
		}
		return true;
		
		
	}
	
	
	

}

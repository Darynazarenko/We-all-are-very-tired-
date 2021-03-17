package com.class15;

public class HMBoyOrGirl {

	public static void main(String[] args) {
	/*
	 * Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom's first name? Mary
Dad's first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
	 */
		
		String momName="Mary";
		String dadName="Daniel";
		Boolean girl=false;
		String babyName;
			
		if(girl) {
			babyName= momName.substring(0, 3)+ dadName.substring(dadName.length()/2);
			System.out.println("Suggested baby name is " +babyName);
		}else {
			babyName=dadName.substring(0, 3)+ momName.substring(momName.length()/2);
			System.out.println("Suggested baby name is " +babyName);
		}

	}

}

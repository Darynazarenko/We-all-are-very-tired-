package com.class15;

public class Hw1 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
*/
		
		String str="Dasha";
		int size=str.length();
		
		if(!str.isEmpty()) {
			if(size%2!=0 && size>=3) {
				System.out.println("Character in the middle of the string is "+ str.charAt(size/2));
			}else {
				System.out.println("String has even number of characters");
			}
			
			
		}
	}

}

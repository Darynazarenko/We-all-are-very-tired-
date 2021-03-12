package com.class03;

public class IfPractice {

	public static void main(String[] args) {
		/*Create a Java program and declare int variable that will hold a month.
		 *  Based on the value of the variable your program should print the name of the month.
		 */
		
		
		int month = 1;
		
		if(month == 1) {
			System.out.println("Jan");
			
		}else if(month == 2) {
			System.out.println("Feb");
		}else if(month == 3) {
			System.out.println("Mar");
		}else if(month==4) {
			System.out.println("Apr");
		}else if(month==5){
			System.out.println("May");
		}else if(month==6) {
			System.out.println("Jun");
		}else if(month==7) {
			System.out.println("Jull");
		}else if(month==8) {
			System.out.println("Aug");
		}else if(month==9) {
			System.out.println("Sept");
		}else if(month==10) {
			System.out.println("Now");
		}else if(month==11) {
			System.out.println("Oct");
		}else if(month==12) {
			System.out.println("Dec");
			
	
		}else {
			System.out.println("Wrong input, try again");
		}
	
	}


}

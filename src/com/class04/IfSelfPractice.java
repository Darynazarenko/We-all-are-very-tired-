package com.class04;

public class IfSelfPractice {

	public static void main(String[] args) {
		/*
		 Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, 
		 you should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program 
		 should check a gpa score.
		  If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
		   otherwise → “You should have studied harder” . */
		
		boolean hasDiploma = true;
		double score = 3.5;
		boolean hasDegree = true;
		
		if(hasDiploma) {
			System.out.println("Congratulations");
			
			
			if(hasDegree) {
				if(score>=3.5) {
				System.out.println("You are eligible for scholarship");
				
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You have to get degree");
		}
	}
		/*
		 Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is 
		 higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house, if price
		  of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
		 */
		
		
		double mortageRate= 2.7;
		double mortagePrice = 20000000;
		
		if(mortageRate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will byu the house");
			if(mortagePrice>20000) {
				System.out.println(" I wiil take a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}

}
}
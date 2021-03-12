package com.class05LogicalOp;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
			if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your quiz score");
		int quize = scan.nextInt();
		
		
		System.out.println("Enter your mid term");
		int mid = scan.nextInt();
		
		
		System.out.println("Enter your final score");
		int lastScore = scan.nextInt();
		
	    int result = (mid + quize + lastScore ) / 3;
	    
	    
	    char grade ;
	    
	    if(result >=90) {
	    	grade = 'A';
	    }else if (result >= 70 && result < 90 ) {
	    	grade = 'B';
	    }else if(result >=50 && result < 70) {
	    	grade = 'C';
	    }else {
	    	grade = 'F';
	    }
	    		
System.out.println("Your grade is " + grade);

			

}
}
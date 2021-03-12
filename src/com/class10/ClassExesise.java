package com.class10;

public class ClassExesise {

	public static void main(String[] args) {
		/*
		 * Create an array of chars to store grades into it: A, B, C, E, D. Then print one.
		 */
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[0]);
		
		
		//Short way to create an array*********************************
		
		
		char[]grades1= {'A', 'B', 'C', 'D', 'E', 'F'};
				
		System.out.println(grades1.length);
		
		
	}

}

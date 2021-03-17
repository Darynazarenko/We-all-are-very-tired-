package com.com13;

public class Grad {
	/*
	 * Create  class Student that will have a method getGrade. 
	 * Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
	 */
	
	char getGrade (int number) {
		if(number>90) {
			return 'A';
		}else if(number>80) {
			return 'B';
		}else if(number>70) {
			return 'C';
		}else if(number>50) {
			return 'D';
		}else {
			return 'F';
		}
	}

}

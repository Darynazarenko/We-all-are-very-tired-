package com.class04;

public class NestedIfExamp {
	public static void main(String[] args) {
		
		boolean isFriday = false;
		int day = 19;
		
		if(isFriday) {
			System.out.println("It is movie day!!!");
			
			if(day==13) {
				System.out.println("I will watch scary movei");
			}else {
				System.out.println("I watch any movie");
			}
		}else {
			System.out.println("I will stay at home and stady Java");
		}
		System.out.println("===============================2example======================");
		
		
		/*
		 check assignment and based on score we will display a message
		 */
		
		boolean completed= true;
		int score = 89;
		
		if(completed) {
			
			if(score>=90) {
				System.out.println("greate job");
			}else if(score>80) {
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("try better");
			}else {
				System.out.println("study more");
			}
		}else {
			System.out.println("Please make sure to completed all assignment on time");
		}
	}

}

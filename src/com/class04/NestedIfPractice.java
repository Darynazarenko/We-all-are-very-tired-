package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {
		boolean morning = true;
		boolean classToday = false;
		
		if(morning) {
			System.out.println("I am going to work");
			
		}else {
			System.out.println("Let me chek if i have a class today");
			
			if(classToday) {
				System.out.println(" I will atend a class today");
			}else {
				System.out.println("I can relax");
			}
		}

	}

}

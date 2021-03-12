package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning = true;
		
		boolean classToday = true;
		// is it morning ?
		
		if(morning) {
			System.out.println("Let me check if i have class today");
			if(classToday) {
				System.out.println("Hello my class");
			}
		}else {
			System.out.println("take a rest");
		}
	}

}

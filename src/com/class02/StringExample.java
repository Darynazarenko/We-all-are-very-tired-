package com.class02;

public class StringExample {
	public static void main (String[] args) {
		String name;
		name ="Chris";
		String greeting = "Good morning";
		String phoneNumber = "443-855-9997";
		
		// Hello my name is Chris 
		System.out.println("Hello my name is " + name);
		
		// How are you Chris?
		System.out.println("How are you? " + name);
		int age =25;
		System.out.println(age + " is my age");
		
		char grate ='A';
		// Chris is A student
		
		System.out.println(name + " is " + grate + " student");
		
		
		String car ="Tesla";
		int year = 2021;
		// I drive 2021 Tesla
		System.out.println("I drive " + car + " " + year);
		
		String laptop = "Macbook";
		int memory = 256;
		// Chris has Macbook with 256 GB memory
		System.out.println(name + " has " + laptop + " with " + memory + " GB" + " memory");
		
		
		int day =7;
		String month = "February";
		String date = month+day;
		System.out.println(date);
		
		
	}

}

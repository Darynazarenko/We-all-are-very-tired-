package com.class05LogicalOp;

public class LogicalOp {
public static void main(String[] args) {
	/*
	 * we have to identify if number is small, medium, large, xLarge, 
	 * if number between 1 and 10 --> small
	 * if number is between 11 and 100 --> medium
	 * if number is between 101 and 1000--> large
	 * if number is between 1000 --> 2000--> xLarge
	 * 
	 */
	
	int num = -345;
	if(num<1) {
		System.out.println("Number is o or negative");
	} else if(num>=1 && num<=10) {
		System.out.println( num +" is small");
	}else if(num>=11 && num<=100) {
		System.out.println(num + " is medium");
	}else if(num >=101 && num <= 1000) {
		System.out.println(num + " is large ");
	}else if(num>=1001 && num<= 2000) {
		System.out.println(num + " is xLarge");
	}else {
		System.out.println(num + " is out pf range");
	}
	
	
	
	
	/*
	 * variable  day 
	 * if day is Tuesday or Wednesday--> Manual class
	 * if day is Monday or Friday --> no class today
	 * if day is Saturday or Sunday --> Java Class
	 * if day is Thursday --> review class
	 */
	
	String day = "";
	
	if(day.equals(("Monday")) || (day.equals("Friday"))){
		System.out.println("Today I have no class");
	}
}
}

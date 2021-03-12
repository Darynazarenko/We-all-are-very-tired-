package com.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Double Comparison. Declare 2 double 
		 * values and if value of first variable is higher then the second, print “Double value __ is larger than __ .”
		 *  Otherwise print...*/
		
		double num1= 150.7;
		double num2 = 23;
		if(num1>num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
					
	}else {
		System.out.println("Double value " + num2 + "is larger than " + num1);
	}
		
		
		/* 

          Create a Java program and name it Temperature Check.
           Create variable to store temperature. Your program should check if temperature is below 32 then it should 
           print “Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“. */
		
		
		double temp = 36;
		
		if(temp<32) {
			System.out.println("Water will freeze with temperature" + temp);
			
		}else {
			System.out.println("Water will NOT freeze with temperature" + temp);
		}
		
		
		double money =5;
		double coke =3;
		
		if(money==coke) {
			System.out.println("I'm buying coke" );
		}else {
			System.out.println("I need exact money" );
		}
		
		
		
		boolean snow =true;
		
		
		if(snow) {
			System.out.println("go play outside");
		}else {
			System.out.println("Stay home");
		}
		
		
		boolean summer = false;
		
		
		if(summer){
			System.out.println("I'm going to Florida");
		}else {
			System.out.println("I will stay home");
		}
		
		
		 
}
}
package com.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 *  Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the City");
		String city = scan.next();
		
		System.out.println("Enter the temperature in Fahrenheits");
        int temp = (int) scan.nextDouble();
        
        int convertToFah = (int) ((temp - 32)/1/8);
        System.out.println("The temperature is " + convertToFah + " the city " + city);
		
        System.out.println("===================================================");
        
        /*
        Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them. 
        If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
        tell them to pay off immediately, otherwise you can tell them that they can spend more.
         */
        
        System.out.println("Wellcome to Bank of America! Do you have our card? Please, entrer true or false");
        boolean card = scan.nextBoolean();
        System.out.println("Enter you current balance please");
        double  balance = scan.nextDouble();
        
        if(card == true) {
       
        	if(balance>=1000) {
        		System.out.println("You have to pay off immediately");
        	}else {
        		System.out.println("Your do not have to make any payments at the moment");
        	}
        }else {
        	System.out.println("Whoulb you like to open a card ?");
        }
        System.out.println("=============================================================");
        
        /*
         * Write a program to ask user to enter numbers of worked years and annual salary.
         *  If user worked for more or equals to 5 years than user is eligible for the bonus, 
         * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */
        
        System.out.println("Enter number of worked years");
        int years = scan.nextInt();
        
        System.out.println("Enter your annual salary");
        double salary = scan.nextDouble();
        
        if(years>=5) {
        	System.out.println("You are eligible ");
        	if(salary>=50000) {
        		System.out.println("Your bonus amount is $5000");
        	}else {
        		System.out.println("Your bonus amount is $3000");
        	}
        	
        }else {
        	System.out.println("Sory you are not eligible for bonus");
        }
	}

}

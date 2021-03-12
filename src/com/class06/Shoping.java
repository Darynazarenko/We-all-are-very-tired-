package com.class06;

import java.util.Scanner;

public class Shoping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there are sale today");
		String sale = scan.nextLine();
		
		System.out.println("What whoud you like to buy");
		String item = scan.nextLine();
		
		System.out.println("What is the price for it");
		double price = scan.nextDouble();
		double discount =0;
		double total = 0;
		
		
		if(sale.equalsIgnoreCase("Yes")) {
			if(price < 10) {
				discount = price* 0.05;
				total = price - discount;
				
			}else if(price > 10 && price< 100) {
				discount= price * 0.1;
				total = price - discount;
				
			}else if(price >=100 && price < 500) {
				discount = price * 0.2;
				total = price - discount;
				
			}else if(price > 500) {
				discount = price * 0.3;
				total = price -  discount;
			}
		}else {
			System.out.println("Im not going for shoping today");
		}
		System.out.println( " The item you bought is : " + item + " \t\n The price is ------ " + "$" +  price + " " + "\t\n Discount aplied is $" + discount + "\t\n Your total is  ------- $" + total );
		
		if(total < 500) {
			System.out.println("\t I did not go shoping crazy");
		}
	}

}

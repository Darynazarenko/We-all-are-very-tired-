package com.class05LogicalOp;

import java.util.Scanner;

public class Comission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of your sale");
		double commision, saleAmount;
		 saleAmount = scan.nextDouble();
		
		
		if(saleAmount< 10) {
			commision = 0;
			
		}else if(saleAmount>=10 && saleAmount <= 100) {
			commision = saleAmount*0.1;
			
		}else if(saleAmount>100 && saleAmount <= 500) {
			commision = saleAmount*0.2;
			
		}else if(saleAmount > 500 && saleAmount <= 1000) {
			commision= saleAmount* 0.3;
			
		}else {
			commision = saleAmount*0.5;
			
		}
		if(commision>500) {
			System.out.println("You are amaizing seller");
		}
		System.out.println("Your commission amount is " + commision);

	}

}

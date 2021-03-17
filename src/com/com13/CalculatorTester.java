package com.com13;

public class CalculatorTester {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(	calculator.add(10, 12));
		double result =calculator.sub(15.5, 10);
		System.out.println(result);
		System.out.println(calculator.multiply(10.2, 12.5));
	
	}

}

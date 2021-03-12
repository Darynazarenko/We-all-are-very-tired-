package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 50;
		// +, * , -, %
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		
		int sum = num1 +num2;
		int sub = num1 - num2;
		int product = num1 & num2;
		int div = num1 / num2;
		// sum of number 10 and 5 is = 15
		System.out.println("sum of number " + num1 + " and " + num2 + " is " + "= " + sum);
		
		double number1 = 10.99;
		double number2 = 90.99;
		
		double sumOfDouble = number1 + number2;
		double subOfDouble = number1 - number2;
		double divOfDouble = number2 / number1;
		System.out.println("result od devision of two double values is : " + divOfDouble);
		
	}

}

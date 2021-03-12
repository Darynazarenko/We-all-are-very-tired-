package com.class03;

public class IfElseIf {

	public static void main(String[] args) {

		double num1 = 23;
		double num2 = 23;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);

		} else if (num1 < num2) {
			System.out.println("Double value " + num2 + "is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		// 2. based on day number define a day

		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today will be Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Sunday");
		}

	}

}

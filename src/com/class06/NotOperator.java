package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		boolean rain = true;
		if(!rain) {
			System.out.println("I will go to the park");
		}
		boolean  boo=!true;
		System.out.println(boo);// false
		
		
		boolean trafic=true;
		if(!trafic) {
			System.out.println("I will come to the meeting on time");// no output is going to be shown
		}
		
		String day = "Monday";
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		boolean homework= true;
		if(!homework) {
			System.out.println("I will be happy");
		}

	}

}

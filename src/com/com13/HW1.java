package com.com13;

public class HW1 {

	
		/*
		 * Create a method that will say Hello in different language based on the country
		 *  that will passed when method is executed.
		 */
		String hello (String country) {
			String strHi;
			
			switch(country.toUpperCase()) {
			case "USA":
				strHi ="Hello";
				break;
			case "UKRAINE":
				strHi = "Pryvit";
				break;
			case "RUSSIA":
				strHi ="Privet";
				break;
			case "GERMANY":
				strHi ="Hallo";
				break;
			case "KOREA":
				strHi ="Anyoung";
				break;
			case "INDONESIA":
				strHi ="Halo";
				break;
				default:
					strHi ="Not sure";
			
			}
			
			
		return strHi;
	}

}

package com.class06;

public class SwitchExamples {
public static void main(String [] args) {
	/*
	 * Store gender using M or F 
	 * based on gender we will specify:
	 * if M --> Male
	 * if F --> Female
	 * otherwise --> not sure
	 */
	
	char gender ='F';
	String description;
	switch(gender) {
	case 'M':
		description = "Male";
		break;
	case 'F':
		description = "Female";
		break;
		default:
			description= "N/A";

	}
	System.out.println("The gender is " + description);
}
}

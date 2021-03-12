package com.class06;

import java.util.Scanner;

public class Language {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your country");
		String country = scan.nextLine();
		String lang = null;
		
		switch(country.toUpperCase()) {
		case "UKRAINE":
			lang = "Ukranian";
			break;
			
		case "BRZIL":
			lang = "Portuguese";
			break;
			
		case "CHINA":
			lang = "Mandarin";
			break;
			
		case "INDIA":
			lang = "Hindi";
			break;
			
		case "ICELAND":
			lang = "English";
			break;
			
		case "ALBANIA":
			lang = "Albanian";
			break;
			
		case "SWITZERLAND":
			lang = " German, French, Romansh, Italian";
			break;
			
		case "PAKISTAN":
			lang = "Urdu, English";
			break;
			
		case "SENEGAL":
			lang = "French";
			break;
			
		case "OMAN":
			lang = "Arabic";
			break;
			default:
				lang = "not sure";
			}
		System.out.println(lang);
	
		
	}

	}



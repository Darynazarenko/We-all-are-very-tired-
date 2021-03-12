package com.class06;

import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String country, food;
		System.out.println("Please, enter your country");
		
		country = scanner.nextLine();
		
		switch(country.toLowerCase()) {
		case "USA":
			food="burger";
			break;
		case "Afganistan":
			food="Keboob";
			break;
		case "Ukraine":
			food="Borch";
			break;
		case "Beralus":
			food= "Draniki";
			break;
		case "Kazakstan":
			food="Horese";
			break;
			default:
				food= "Unknown";
		}
		System.out.println("in " + country + " the favoriset food is " + food);

	}

}

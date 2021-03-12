package com.class06;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String carMake = scan.nextLine();
		String carOrigin = null;

		switch(carMake){
		  case "BMW":
		  carOrigin = "german car";
		  break;

		  case "Toyota":
		  carOrigin = "japanese car";
		  break;

		  case "Maserati":
		  carOrigin = "italian car";
		  break;
		  default:
		  carOrigin = "unknown";
		}
		System.out.println("Your favorite car is " + carOrigin);


		}
		}
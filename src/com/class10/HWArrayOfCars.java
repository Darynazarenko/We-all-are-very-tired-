package com.class10;

public class HWArrayOfCars {
	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		System.out.println("-------- For Loop--------------------");
		String[] cars= {"Honda", "Kia", "Subaru", "Tesla", "BMW", "Ford"};
		for(int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("-------------For Each Loop-----------------");
		
		for(String c: cars) {
			System.out.println(c);
		}
		
		System.out.println("--------For loop-----------------");
		
		String[] animals= {"Elephant", "Rhino", "Hippo", "Bear", "Zibra", "Lion"};
		for(int i= 0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("----------For Each Loop-------------");
		for(String an:animals) {
			System.out.println(an);
		}
	}

}

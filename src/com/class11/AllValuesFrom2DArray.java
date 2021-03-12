package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		String[][] usa= {
				{"Alexandria", "Richmond", "Viena", "Fairfax", "Oakton"},
				{"Philly", " Strassburg" },
				{"Boston"},
				{"LA", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahassee"}
		};
		
		System.out.println(usa.length);//5
		System.out.println(usa[0].length);// 5 elements inside 1 array
		
		System.out.println("----- to print te values of 2D array");
		
		for(int r=0; r<usa.length; r++) {// iterates over rows
			for(int c=0; c<usa[r].length; c++) {
				System.out.println(usa[r][c]);
			}
			
		}
		System.out.println("------ nested for each loop --------");
		for(String[] cities:usa) {
			for(String city:cities) {
				System.out.print(city+ " ");
			}
			System.out.println();
		}
	}

}

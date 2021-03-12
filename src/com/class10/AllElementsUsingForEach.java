package com.class10;

public class AllElementsUsingForEach {

	public static void main(String[] args) {
		int[] numbers= {10, 14, 75, 6, 57};
		for(int num:numbers) {
			if(num%2==0) {
				
				System.out.println(num);
			}
			
		}
		
		String[] names1= {"Mirage Kamran", "Kenza", "Yuliya (Philadelphia, PA)", "Safiet Dzhemaliadinov (Chicago, IL)", "Aisha", 
				"Daryna Nazarenko ", "Aryan", "Yara", "Zhanna" };
		
		for(int i=0; i<names1.length; i++) {
			System.out.println(names1[i]);
		}
		System.out.println("-----------------------");
		for(String n: names1) {
			System.out.println(n);
		}
		
System.out.println();
	}

}

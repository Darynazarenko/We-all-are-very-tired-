package com.class10;

public class EllementsFromArrey {

	public static void main(String[] args) {
		int[] numbers= {10, 14, 75, 6, 57};
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]);
			}
			
		}
		System.out.println("----------print revers----------");
		
		for(int i=numbers.length-1;i>=0; i--) {
			System.out.println(numbers[i]);
		}
				
	}

}
